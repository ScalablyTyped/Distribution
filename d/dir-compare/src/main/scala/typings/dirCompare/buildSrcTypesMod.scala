package typings.dirCompare

import org.scalablytyped.runtime.StringDictionary
import typings.dirCompare.dirCompareInts.`-1`
import typings.dirCompare.dirCompareInts.`0`
import typings.dirCompare.dirCompareInts.`1`
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  trait BrokenLinksStatistics extends StObject {
    
    /**
      * Number of broken links with same name appearing in both path1 and path2  (leftBrokenLinks + rightBrokenLinks + distinctBrokenLinks)
      */
    var distinctBrokenLinks: Double
    
    /**
      * Number of broken links only in path1
      */
    var leftBrokenLinks: Double
    
    /**
      * Number of broken links only in path2
      */
    var rightBrokenLinks: Double
    
    /**
      * Total number of broken links
      */
    var totalBrokenLinks: Double
  }
  object BrokenLinksStatistics {
    
    inline def apply(
      distinctBrokenLinks: Double,
      leftBrokenLinks: Double,
      rightBrokenLinks: Double,
      totalBrokenLinks: Double
    ): BrokenLinksStatistics = {
      val __obj = js.Dynamic.literal(distinctBrokenLinks = distinctBrokenLinks.asInstanceOf[js.Any], leftBrokenLinks = leftBrokenLinks.asInstanceOf[js.Any], rightBrokenLinks = rightBrokenLinks.asInstanceOf[js.Any], totalBrokenLinks = totalBrokenLinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokenLinksStatistics]
    }
    
    extension [Self <: BrokenLinksStatistics](x: Self) {
      
      inline def setDistinctBrokenLinks(value: Double): Self = StObject.set(x, "distinctBrokenLinks", value.asInstanceOf[js.Any])
      
      inline def setLeftBrokenLinks(value: Double): Self = StObject.set(x, "leftBrokenLinks", value.asInstanceOf[js.Any])
      
      inline def setRightBrokenLinks(value: Double): Self = StObject.set(x, "rightBrokenLinks", value.asInstanceOf[js.Any])
      
      inline def setTotalBrokenLinks(value: Double): Self = StObject.set(x, "totalBrokenLinks", value.asInstanceOf[js.Any])
    }
  }
  
  type CompareFileAsync = js.Function5[
    /* path1 */ String, 
    /* stat1 */ Stats, 
    /* path2 */ String, 
    /* stat2 */ Stats, 
    /* options */ Options, 
    js.Promise[Boolean]
  ]
  
  trait CompareFileHandler extends StObject {
    
    def compareAsync(path1: String, stat1: Stats, path2: String, stat2: Stats, options: Options): js.Promise[Boolean]
    @JSName("compareAsync")
    var compareAsync_Original: CompareFileAsync
    
    def compareSync(path1: String, stat1: Stats, path2: String, stat2: Stats, options: Options): Boolean
    @JSName("compareSync")
    var compareSync_Original: CompareFileSync
  }
  object CompareFileHandler {
    
    inline def apply(
      compareAsync: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => js.Promise[Boolean],
      compareSync: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => Boolean
    ): CompareFileHandler = {
      val __obj = js.Dynamic.literal(compareAsync = js.Any.fromFunction5(compareAsync), compareSync = js.Any.fromFunction5(compareSync))
      __obj.asInstanceOf[CompareFileHandler]
    }
    
    extension [Self <: CompareFileHandler](x: Self) {
      
      inline def setCompareAsync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => js.Promise[Boolean]
      ): Self = StObject.set(x, "compareAsync", js.Any.fromFunction5(value))
      
      inline def setCompareSync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => Boolean
      ): Self = StObject.set(x, "compareSync", js.Any.fromFunction5(value))
    }
  }
  
  type CompareFileSync = js.Function5[
    /* path1 */ String, 
    /* stat1 */ Stats, 
    /* path2 */ String, 
    /* stat2 */ Stats, 
    /* options */ Options, 
    Boolean
  ]
  
  type CompareNameHandler = js.Function3[/* name1 */ String, /* name2 */ String, /* options */ Options, `0` | `1` | `-1`]
  
  type DiffSet = js.Array[Difference]
  
  trait Difference
    extends StObject
       with /**
    * Properties to be used in various extension points ie. result builder.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Left entry modification date (stat.mtime).
      * Is undefined if missing on the left side.
      */
    var date1: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Right entry modification date (stat.mtime).
      * Is undefined if missing on the right side.
      */
    var date2: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Depth level relative to root dir.
      */
    var level: Double
    
    /**
      * Left file/directory name.
      * Is undefined if missing on the left side.
      */
    var name1: js.UndefOr[String] = js.undefined
    
    /**
      * Right file/directory name.
      * Is undefined if missing on the right side.
      */
    var name2: js.UndefOr[String] = js.undefined
    
    /**
      * Path not including file/directory name; can be relative or absolute depending on call to compare().
      * Is undefined if missing on the left side.
      */
    var path1: js.UndefOr[String] = js.undefined
    
    /**
      * Path not including file/directory name; can be relative or absolute depending on call to compare().
      * Is undefined if missing on the right side.
      */
    var path2: js.UndefOr[String] = js.undefined
    
    /**
      * Permission related state of left/right entries.
      */
    var permissionDeniedState: PermissionDeniedState
    
    /**
      * Provides reason when two identically named entries are distinct.
      */
    var reason: Reason
    
    /**
      * Path relative to root dir.
      */
    var relativePath: String
    
    /**
      * Left file size.
      * Is undefined if missing on the left side.
      */
    var size1: js.UndefOr[Double] = js.undefined
    
    /**
      * Right file size.
      * Is undefined if missing on the right side.
      */
    var size2: js.UndefOr[Double] = js.undefined
    
    /**
      * See [[DifferenceState]]
      */
    var state: DifferenceState
    
    /**
      * Type of left entry.
      * Is undefined if missing on the left side.
      */
    var type1: DifferenceType
    
    /**
      * Type of right entry.
      * Is undefined if missing on the right side.
      */
    var type2: DifferenceType
  }
  object Difference {
    
    inline def apply(
      level: Double,
      permissionDeniedState: PermissionDeniedState,
      relativePath: String,
      state: DifferenceState,
      type1: DifferenceType,
      type2: DifferenceType
    ): Difference = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], permissionDeniedState = permissionDeniedState.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], type1 = type1.asInstanceOf[js.Any], type2 = type2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Difference]
    }
    
    extension [Self <: Difference](x: Self) {
      
      inline def setDate1(value: js.Date): Self = StObject.set(x, "date1", value.asInstanceOf[js.Any])
      
      inline def setDate1Undefined: Self = StObject.set(x, "date1", js.undefined)
      
      inline def setDate2(value: js.Date): Self = StObject.set(x, "date2", value.asInstanceOf[js.Any])
      
      inline def setDate2Undefined: Self = StObject.set(x, "date2", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setName1(value: String): Self = StObject.set(x, "name1", value.asInstanceOf[js.Any])
      
      inline def setName1Undefined: Self = StObject.set(x, "name1", js.undefined)
      
      inline def setName2(value: String): Self = StObject.set(x, "name2", value.asInstanceOf[js.Any])
      
      inline def setName2Undefined: Self = StObject.set(x, "name2", js.undefined)
      
      inline def setPath1(value: String): Self = StObject.set(x, "path1", value.asInstanceOf[js.Any])
      
      inline def setPath1Undefined: Self = StObject.set(x, "path1", js.undefined)
      
      inline def setPath2(value: String): Self = StObject.set(x, "path2", value.asInstanceOf[js.Any])
      
      inline def setPath2Undefined: Self = StObject.set(x, "path2", js.undefined)
      
      inline def setPermissionDeniedState(value: PermissionDeniedState): Self = StObject.set(x, "permissionDeniedState", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setSize1(value: Double): Self = StObject.set(x, "size1", value.asInstanceOf[js.Any])
      
      inline def setSize1Undefined: Self = StObject.set(x, "size1", js.undefined)
      
      inline def setSize2(value: Double): Self = StObject.set(x, "size2", value.asInstanceOf[js.Any])
      
      inline def setSize2Undefined: Self = StObject.set(x, "size2", js.undefined)
      
      inline def setState(value: DifferenceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setType1(value: DifferenceType): Self = StObject.set(x, "type1", value.asInstanceOf[js.Any])
      
      inline def setType2(value: DifferenceType): Self = StObject.set(x, "type2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.dirCompareStrings.equal
    - typings.dirCompare.dirCompareStrings.left
    - typings.dirCompare.dirCompareStrings.right
    - typings.dirCompare.dirCompareStrings.distinct
  */
  trait DifferenceState extends StObject
  object DifferenceState {
    
    inline def distinct: typings.dirCompare.dirCompareStrings.distinct = "distinct".asInstanceOf[typings.dirCompare.dirCompareStrings.distinct]
    
    inline def equal: typings.dirCompare.dirCompareStrings.equal = "equal".asInstanceOf[typings.dirCompare.dirCompareStrings.equal]
    
    inline def left: typings.dirCompare.dirCompareStrings.left = "left".asInstanceOf[typings.dirCompare.dirCompareStrings.left]
    
    inline def right: typings.dirCompare.dirCompareStrings.right = "right".asInstanceOf[typings.dirCompare.dirCompareStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.dirCompareStrings.missing
    - typings.dirCompare.dirCompareStrings.file
    - typings.dirCompare.dirCompareStrings.directory
    - typings.dirCompare.dirCompareStrings.`broken-link`
  */
  trait DifferenceType extends StObject
  object DifferenceType {
    
    inline def `broken-link`: typings.dirCompare.dirCompareStrings.`broken-link` = "broken-link".asInstanceOf[typings.dirCompare.dirCompareStrings.`broken-link`]
    
    inline def directory: typings.dirCompare.dirCompareStrings.directory = "directory".asInstanceOf[typings.dirCompare.dirCompareStrings.directory]
    
    inline def file: typings.dirCompare.dirCompareStrings.file = "file".asInstanceOf[typings.dirCompare.dirCompareStrings.file]
    
    inline def missing: typings.dirCompare.dirCompareStrings.missing = "missing".asInstanceOf[typings.dirCompare.dirCompareStrings.missing]
  }
  
  trait Entry extends StObject {
    
    var absolutePath: String
    
    var isBrokenLink: Boolean
    
    var isDirectory: Boolean
    
    /**
      * True when this entry is not readable.
      * This value is set only when [[Options.handlePermissionDenied]] is enabled.
      */
    var isPermissionDenied: Boolean
    
    var isSymlink: Boolean
    
    var lstat: Stats
    
    var name: String
    
    var path: String
    
    var stat: Stats
  }
  object Entry {
    
    inline def apply(
      absolutePath: String,
      isBrokenLink: Boolean,
      isDirectory: Boolean,
      isPermissionDenied: Boolean,
      isSymlink: Boolean,
      lstat: Stats,
      name: String,
      path: String,
      stat: Stats
    ): Entry = {
      val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], isBrokenLink = isBrokenLink.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isPermissionDenied = isPermissionDenied.asInstanceOf[js.Any], isSymlink = isSymlink.asInstanceOf[js.Any], lstat = lstat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setIsBrokenLink(value: Boolean): Self = StObject.set(x, "isBrokenLink", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsPermissionDenied(value: Boolean): Self = StObject.set(x, "isPermissionDenied", value.asInstanceOf[js.Any])
      
      inline def setIsSymlink(value: Boolean): Self = StObject.set(x, "isSymlink", value.asInstanceOf[js.Any])
      
      inline def setLstat(value: Stats): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileCompareHandlers extends StObject {
    
    /**
      * Default file content comparison handlers, used if [[Options.compareFileAsync]] or [[Options.compareFileSync]] are not specified.
      *
      * Performs binary comparison.
      */
    var defaultFileCompare: CompareFileHandler
    
    /**
      * Compares files line by line.
      *
      * Options:
      * * ignoreLineEnding - true/false (default: false) - Ignore cr/lf line endings
      * * ignoreWhiteSpaces - true/false (default: false) - Ignore white spaces at the beginning and ending of a line (similar to 'diff -b')
      * * ignoreAllWhiteSpaces - true/false (default: false) - Ignore all white space differences (similar to 'diff -w')
      * * ignoreEmptyLines - true/false (default: false) - Ignores differences caused by empty lines (similar to 'diff -B')
      */
    var lineBasedFileCompare: CompareFileHandler
  }
  object FileCompareHandlers {
    
    inline def apply(defaultFileCompare: CompareFileHandler, lineBasedFileCompare: CompareFileHandler): FileCompareHandlers = {
      val __obj = js.Dynamic.literal(defaultFileCompare = defaultFileCompare.asInstanceOf[js.Any], lineBasedFileCompare = lineBasedFileCompare.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileCompareHandlers]
    }
    
    extension [Self <: FileCompareHandlers](x: Self) {
      
      inline def setDefaultFileCompare(value: CompareFileHandler): Self = StObject.set(x, "defaultFileCompare", value.asInstanceOf[js.Any])
      
      inline def setLineBasedFileCompare(value: CompareFileHandler): Self = StObject.set(x, "lineBasedFileCompare", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialStatistics
    extends StObject
       with /**
    * Properties to be used in various extension points ie. result builder.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Stats about broken links.
      */
    var brokenLinks: BrokenLinksStatistics
    
    /**
      * Number of distinct entries.
      */
    var distinct: Double
    
    /**
      * Number of distinct directories.
      */
    var distinctDirs: Double
    
    /**
      * Number of distinct files.
      */
    var distinctFiles: Double
    
    /**
      * Number of equal entries.
      */
    var equal: Double
    
    /**
      * Number of equal directories.
      */
    var equalDirs: Double
    
    /**
      * Number of equal files.
      */
    var equalFiles: Double
    
    /**
      * Number of entries only in path1.
      */
    var left: Double
    
    /**
      * Number of directories only in path1.
      */
    var leftDirs: Double
    
    /**
      * Number of files only in path1.
      */
    var leftFiles: Double
    
    /**
      * Stats about entries that could not be accessed.
      */
    var permissionDenied: PermissionDeniedStatistics
    
    /**
      * Number of entries only in path2.
      */
    var right: Double
    
    /**
      * Number of directories only in path2.
      */
    var rightDirs: Double
    
    /**
      * Number of files only in path2
      */
    var rightFiles: Double
    
    /**
      * Statistics available if 'compareSymlink' options is used.
      */
    var symlinks: js.UndefOr[SymlinkStatistics] = js.undefined
  }
  object InitialStatistics {
    
    inline def apply(
      brokenLinks: BrokenLinksStatistics,
      distinct: Double,
      distinctDirs: Double,
      distinctFiles: Double,
      equal: Double,
      equalDirs: Double,
      equalFiles: Double,
      left: Double,
      leftDirs: Double,
      leftFiles: Double,
      permissionDenied: PermissionDeniedStatistics,
      right: Double,
      rightDirs: Double,
      rightFiles: Double
    ): InitialStatistics = {
      val __obj = js.Dynamic.literal(brokenLinks = brokenLinks.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], distinctDirs = distinctDirs.asInstanceOf[js.Any], distinctFiles = distinctFiles.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], equalDirs = equalDirs.asInstanceOf[js.Any], equalFiles = equalFiles.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftDirs = leftDirs.asInstanceOf[js.Any], leftFiles = leftFiles.asInstanceOf[js.Any], permissionDenied = permissionDenied.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rightDirs = rightDirs.asInstanceOf[js.Any], rightFiles = rightFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialStatistics]
    }
    
    extension [Self <: InitialStatistics](x: Self) {
      
      inline def setBrokenLinks(value: BrokenLinksStatistics): Self = StObject.set(x, "brokenLinks", value.asInstanceOf[js.Any])
      
      inline def setDistinct(value: Double): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      inline def setDistinctDirs(value: Double): Self = StObject.set(x, "distinctDirs", value.asInstanceOf[js.Any])
      
      inline def setDistinctFiles(value: Double): Self = StObject.set(x, "distinctFiles", value.asInstanceOf[js.Any])
      
      inline def setEqual(value: Double): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
      
      inline def setEqualDirs(value: Double): Self = StObject.set(x, "equalDirs", value.asInstanceOf[js.Any])
      
      inline def setEqualFiles(value: Double): Self = StObject.set(x, "equalFiles", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftDirs(value: Double): Self = StObject.set(x, "leftDirs", value.asInstanceOf[js.Any])
      
      inline def setLeftFiles(value: Double): Self = StObject.set(x, "leftFiles", value.asInstanceOf[js.Any])
      
      inline def setPermissionDenied(value: PermissionDeniedStatistics): Self = StObject.set(x, "permissionDenied", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightDirs(value: Double): Self = StObject.set(x, "rightDirs", value.asInstanceOf[js.Any])
      
      inline def setRightFiles(value: Double): Self = StObject.set(x, "rightFiles", value.asInstanceOf[js.Any])
      
      inline def setSymlinks(value: SymlinkStatistics): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    }
  }
  
  type OptionalDiffSet = js.UndefOr[DiffSet]
  
  trait Options
    extends StObject
       with /**
    * Properties to be used in various extension points ie. result builder.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Compares files by content. Defaults to 'false'.
      *
      * Usually one of `compareSize` or `compareContent` options has to be activated. Otherwise files are compared by name disregarding size or content.
      */
    var compareContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compares files by date of modification (stat.mtime). Defaults to 'false'.
      *
      * Also see [[Options.dateTolerance]].
      */
    var compareDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * File content comparison handler. See [Custom file comparators](https://github.com/gliviu/dir-compare#custom-file-content-comparators).
      */
    var compareFileAsync: js.UndefOr[CompareFileAsync] = js.undefined
    
    /**
      * File content comparison handler. See [Custom file comparators](https://github.com/gliviu/dir-compare#custom-file-content-comparators).
      */
    var compareFileSync: js.UndefOr[CompareFileSync] = js.undefined
    
    /**
      * Entry name comparison handler. See [Custom name comparators](https://github.com/gliviu/dir-compare#custom-name-comparators).
      */
    var compareNameHandler: js.UndefOr[CompareNameHandler] = js.undefined
    
    /**
      * Compares files by size. Defaults to 'false'.
      *
      * Usually one of `compareSize` or `compareContent` options has to be activated. Otherwise files are compared by name disregarding size or content.
      */
    var compareSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compares entries by symlink. Defaults to 'false'.
      * If this option is enabled two entries must have the same type in order to be considered equal.
      * They have to be either two fies, two directories or two symlinks.
      *
      * If left entry is a file and right entry is a symlink, they are considered distinct disregarding the content of the file.
      *
      * Further if both entries are symlinks they need to have the same link value. For example if one symlink points to '/x/b.txt' and the other to '/x/../x/b.txt' the symlinks are considered distinct even if they point to the same file.
      */
    var compareSymlink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Two files are considered to have the same date if the difference between their modification dates fits within date tolerance. Defaults to 1000 ms.
      */
    var dateTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * File/directory name exclude filter. Comma separated minimatch patterns. See [Glob patterns](https://github.com/gliviu/dir-compare#glob-patterns)
      */
    var excludeFilter: js.UndefOr[String] = js.undefined
    
    /**
      * Handle permission denied errors. Defaults to 'false'.
      *
      * By default when some entry cannot be read due to `EACCES` error the comparison will
      * stop immediately with an exception.
      *
      * If `handlePermissionDenied` is set to true the comparison will continue when unreadable entries are encountered.
      *
      * Offending entries will be reported within [[Difference.permissionDeniedState]], [[Difference.reason]] and [[Result.permissionDenied]].
      *
      * Lets consider we want to compare two identical folders `A` and `B` with `B/dir2` being unreadable for the current user.
      * ```
      * A                    B
      * ├── dir1             ├── dir1
      * ├──── file1          ├──── file1
      * ├── dir2             ├── dir2 (permission denied)
      * └─────file2          └─────file2
      * ```
      *
      * [[Result.diffSet]] will look like:
      *
      * |relativePath  |path1    |path2    | state      |reason                  |permissionDeniedState|
      * |--------------|---------|---------|------------|------------------------|---------------------|
      * |[/]           |dir1     |dir1     |`equal`     |                        |                     |
      * |[/dir1]       |file1    |file1    |`equal`     |                        |                     |
      * |[/]           |dir2     |dir2     |`distinct`  |  `permission-denied`   |`access-error-right` |
      * |[/dir2]       |file2    |missing  |`left`      |                        |                     |
      *
      * And [[Result.permissionDenied]] statistics look like
      * ```json
      * {
      *   leftPermissionDenied: 0,
      *   rightPermissionDenied: 1,
      *   distinctPermissionDenied: 0,
      *   totalPermissionDenied: 1
      * }
      * ```
      */
    var handlePermissionDenied: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignores case when comparing names. Defaults to 'false'.
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * File name filter. Comma separated minimatch patterns. See [Glob patterns](https://github.com/gliviu/dir-compare#glob-patterns).
      */
    var includeFilter: js.UndefOr[String] = js.undefined
    
    /**
      * Toggles presence of diffSet in output. If true, only statistics are provided. Use this when comparing large number of files to avoid out of memory situations. Defaults to 'false'.
      */
    var noDiffSet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback for constructing result. Called for each compared entry pair.
      *
      * Updates 'statistics' and 'diffSet'.
      *
      * See [Custom result builder](https://github.com/gliviu/dir-compare#custom-result-builder).
      */
    var resultBuilder: js.UndefOr[ResultBuilder] = js.undefined
    
    /**
      * Ignore empty directories. Defaults to 'false'.
      */
    var skipEmptyDirs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skips sub directories. Defaults to 'false'.
      */
    var skipSubdirs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignore symbolic links. Defaults to 'false'.
      */
    var skipSymlinks: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompareContent(value: Boolean): Self = StObject.set(x, "compareContent", value.asInstanceOf[js.Any])
      
      inline def setCompareContentUndefined: Self = StObject.set(x, "compareContent", js.undefined)
      
      inline def setCompareDate(value: Boolean): Self = StObject.set(x, "compareDate", value.asInstanceOf[js.Any])
      
      inline def setCompareDateUndefined: Self = StObject.set(x, "compareDate", js.undefined)
      
      inline def setCompareFileAsync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => js.Promise[Boolean]
      ): Self = StObject.set(x, "compareFileAsync", js.Any.fromFunction5(value))
      
      inline def setCompareFileAsyncUndefined: Self = StObject.set(x, "compareFileAsync", js.undefined)
      
      inline def setCompareFileSync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => Boolean
      ): Self = StObject.set(x, "compareFileSync", js.Any.fromFunction5(value))
      
      inline def setCompareFileSyncUndefined: Self = StObject.set(x, "compareFileSync", js.undefined)
      
      inline def setCompareNameHandler(value: (/* name1 */ String, /* name2 */ String, /* options */ Options) => `0` | `1` | `-1`): Self = StObject.set(x, "compareNameHandler", js.Any.fromFunction3(value))
      
      inline def setCompareNameHandlerUndefined: Self = StObject.set(x, "compareNameHandler", js.undefined)
      
      inline def setCompareSize(value: Boolean): Self = StObject.set(x, "compareSize", value.asInstanceOf[js.Any])
      
      inline def setCompareSizeUndefined: Self = StObject.set(x, "compareSize", js.undefined)
      
      inline def setCompareSymlink(value: Boolean): Self = StObject.set(x, "compareSymlink", value.asInstanceOf[js.Any])
      
      inline def setCompareSymlinkUndefined: Self = StObject.set(x, "compareSymlink", js.undefined)
      
      inline def setDateTolerance(value: Double): Self = StObject.set(x, "dateTolerance", value.asInstanceOf[js.Any])
      
      inline def setDateToleranceUndefined: Self = StObject.set(x, "dateTolerance", js.undefined)
      
      inline def setExcludeFilter(value: String): Self = StObject.set(x, "excludeFilter", value.asInstanceOf[js.Any])
      
      inline def setExcludeFilterUndefined: Self = StObject.set(x, "excludeFilter", js.undefined)
      
      inline def setHandlePermissionDenied(value: Boolean): Self = StObject.set(x, "handlePermissionDenied", value.asInstanceOf[js.Any])
      
      inline def setHandlePermissionDeniedUndefined: Self = StObject.set(x, "handlePermissionDenied", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setIncludeFilter(value: String): Self = StObject.set(x, "includeFilter", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilterUndefined: Self = StObject.set(x, "includeFilter", js.undefined)
      
      inline def setNoDiffSet(value: Boolean): Self = StObject.set(x, "noDiffSet", value.asInstanceOf[js.Any])
      
      inline def setNoDiffSetUndefined: Self = StObject.set(x, "noDiffSet", js.undefined)
      
      inline def setResultBuilder(
        value: (/* entry1 */ js.UndefOr[Entry], /* entry2 */ js.UndefOr[Entry], /* state */ DifferenceState, /* level */ Double, /* relativePath */ String, /* options */ Options, /* statistics */ InitialStatistics, /* diffSet */ js.UndefOr[DiffSet], /* reason */ js.UndefOr[Reason], /* permissionDeniedState */ PermissionDeniedState) => Unit
      ): Self = StObject.set(x, "resultBuilder", js.Any.fromFunction10(value))
      
      inline def setResultBuilderUndefined: Self = StObject.set(x, "resultBuilder", js.undefined)
      
      inline def setSkipEmptyDirs(value: Boolean): Self = StObject.set(x, "skipEmptyDirs", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyDirsUndefined: Self = StObject.set(x, "skipEmptyDirs", js.undefined)
      
      inline def setSkipSubdirs(value: Boolean): Self = StObject.set(x, "skipSubdirs", value.asInstanceOf[js.Any])
      
      inline def setSkipSubdirsUndefined: Self = StObject.set(x, "skipSubdirs", js.undefined)
      
      inline def setSkipSymlinks(value: Boolean): Self = StObject.set(x, "skipSymlinks", value.asInstanceOf[js.Any])
      
      inline def setSkipSymlinksUndefined: Self = StObject.set(x, "skipSymlinks", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dirCompare.dirCompareStrings.`access-ok`
    - typings.dirCompare.dirCompareStrings.`access-error-both`
    - typings.dirCompare.dirCompareStrings.`access-error-left`
    - typings.dirCompare.dirCompareStrings.`access-error-right`
  */
  trait PermissionDeniedState extends StObject
  object PermissionDeniedState {
    
    inline def `access-error-both`: typings.dirCompare.dirCompareStrings.`access-error-both` = "access-error-both".asInstanceOf[typings.dirCompare.dirCompareStrings.`access-error-both`]
    
    inline def `access-error-left`: typings.dirCompare.dirCompareStrings.`access-error-left` = "access-error-left".asInstanceOf[typings.dirCompare.dirCompareStrings.`access-error-left`]
    
    inline def `access-error-right`: typings.dirCompare.dirCompareStrings.`access-error-right` = "access-error-right".asInstanceOf[typings.dirCompare.dirCompareStrings.`access-error-right`]
    
    inline def `access-ok`: typings.dirCompare.dirCompareStrings.`access-ok` = "access-ok".asInstanceOf[typings.dirCompare.dirCompareStrings.`access-ok`]
  }
  
  trait PermissionDeniedStatistics extends StObject {
    
    /**
      * Number of forbidden entries with same name appearing in both path1 and path2  (leftPermissionDenied + rightPermissionDenied + distinctPermissionDenied)
      */
    var distinctPermissionDenied: Double
    
    /**
      * Number of forbidden entries found only in path1
      */
    var leftPermissionDenied: Double
    
    /**
      * Number of forbidden entries found only in path2
      */
    var rightPermissionDenied: Double
    
    /**
      * Total number of forbidden entries
      */
    var totalPermissionDenied: Double
  }
  object PermissionDeniedStatistics {
    
    inline def apply(
      distinctPermissionDenied: Double,
      leftPermissionDenied: Double,
      rightPermissionDenied: Double,
      totalPermissionDenied: Double
    ): PermissionDeniedStatistics = {
      val __obj = js.Dynamic.literal(distinctPermissionDenied = distinctPermissionDenied.asInstanceOf[js.Any], leftPermissionDenied = leftPermissionDenied.asInstanceOf[js.Any], rightPermissionDenied = rightPermissionDenied.asInstanceOf[js.Any], totalPermissionDenied = totalPermissionDenied.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionDeniedStatistics]
    }
    
    extension [Self <: PermissionDeniedStatistics](x: Self) {
      
      inline def setDistinctPermissionDenied(value: Double): Self = StObject.set(x, "distinctPermissionDenied", value.asInstanceOf[js.Any])
      
      inline def setLeftPermissionDenied(value: Double): Self = StObject.set(x, "leftPermissionDenied", value.asInstanceOf[js.Any])
      
      inline def setRightPermissionDenied(value: Double): Self = StObject.set(x, "rightPermissionDenied", value.asInstanceOf[js.Any])
      
      inline def setTotalPermissionDenied(value: Double): Self = StObject.set(x, "totalPermissionDenied", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.dirCompare.dirCompareStrings.`different-size`
    - typings.dirCompare.dirCompareStrings.`different-date`
    - typings.dirCompare.dirCompareStrings.`different-content`
    - typings.dirCompare.dirCompareStrings.`broken-link`
    - typings.dirCompare.dirCompareStrings.`different-symlink`
    - typings.dirCompare.dirCompareStrings.`permission-denied`
  */
  type Reason = js.UndefOr[_Reason]
  
  trait Result
    extends StObject
       with Statistics {
    
    /**
      * Detailed list of comparison results.
      * Present if [[Options.noDiffSet]] is false.
      */
    var diffSet: js.UndefOr[DiffSet] = js.undefined
  }
  object Result {
    
    inline def apply(
      brokenLinks: BrokenLinksStatistics,
      differences: Double,
      differencesDirs: Double,
      differencesFiles: Double,
      distinct: Double,
      distinctDirs: Double,
      distinctFiles: Double,
      equal: Double,
      equalDirs: Double,
      equalFiles: Double,
      left: Double,
      leftDirs: Double,
      leftFiles: Double,
      permissionDenied: PermissionDeniedStatistics,
      right: Double,
      rightDirs: Double,
      rightFiles: Double,
      same: Boolean,
      total: Double,
      totalDirs: Double,
      totalFiles: Double
    ): Result = {
      val __obj = js.Dynamic.literal(brokenLinks = brokenLinks.asInstanceOf[js.Any], differences = differences.asInstanceOf[js.Any], differencesDirs = differencesDirs.asInstanceOf[js.Any], differencesFiles = differencesFiles.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], distinctDirs = distinctDirs.asInstanceOf[js.Any], distinctFiles = distinctFiles.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], equalDirs = equalDirs.asInstanceOf[js.Any], equalFiles = equalFiles.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftDirs = leftDirs.asInstanceOf[js.Any], leftFiles = leftFiles.asInstanceOf[js.Any], permissionDenied = permissionDenied.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rightDirs = rightDirs.asInstanceOf[js.Any], rightFiles = rightFiles.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalDirs = totalDirs.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setDiffSet(value: DiffSet): Self = StObject.set(x, "diffSet", value.asInstanceOf[js.Any])
      
      inline def setDiffSetUndefined: Self = StObject.set(x, "diffSet", js.undefined)
      
      inline def setDiffSetVarargs(value: Difference*): Self = StObject.set(x, "diffSet", js.Array(value*))
    }
  }
  
  type ResultBuilder = /**
    * @param entry1 Left entry.
    * @param entry2 Right entry.
    * @param state See [[DifferenceState]].
    * @param level Depth level relative to root dir.
    * @param relativePath Path relative to root dir.
    * @param statistics Statistics to be updated.
    * @param diffSet Status per each entry to be appended.
    * Do not append if [[Options.noDiffSet]] is false.
    * @param reason See [[Reason]]. Not available if entries are equal.
    */
  js.Function10[
    /* entry1 */ js.UndefOr[Entry], 
    /* entry2 */ js.UndefOr[Entry], 
    /* state */ DifferenceState, 
    /* level */ Double, 
    /* relativePath */ String, 
    /* options */ Options, 
    /* statistics */ InitialStatistics, 
    /* diffSet */ js.UndefOr[DiffSet], 
    /* reason */ js.UndefOr[Reason], 
    /* permissionDeniedState */ PermissionDeniedState, 
    Unit
  ]
  
  trait Statistics
    extends StObject
       with InitialStatistics {
    
    /**
      * Total number of differences (distinct+left+right).
      */
    var differences: Double
    
    /**
      * Total number of different directories (distinctDirs+leftDirs+rightDirs).
      */
    var differencesDirs: Double
    
    /**
      * Total number of different files (distinctFiles+leftFiles+rightFiles).
      */
    var differencesFiles: Double
    
    /**
      * True if directories are identical.
      */
    var same: Boolean
    
    /**
      * Total number of entries (differences+equal).
      */
    var total: Double
    
    /**
      * Total number of directories (differencesDirs+equalDirs).
      */
    var totalDirs: Double
    
    /**
      * Total number of files (differencesFiles+equalFiles).
      */
    var totalFiles: Double
  }
  object Statistics {
    
    inline def apply(
      brokenLinks: BrokenLinksStatistics,
      differences: Double,
      differencesDirs: Double,
      differencesFiles: Double,
      distinct: Double,
      distinctDirs: Double,
      distinctFiles: Double,
      equal: Double,
      equalDirs: Double,
      equalFiles: Double,
      left: Double,
      leftDirs: Double,
      leftFiles: Double,
      permissionDenied: PermissionDeniedStatistics,
      right: Double,
      rightDirs: Double,
      rightFiles: Double,
      same: Boolean,
      total: Double,
      totalDirs: Double,
      totalFiles: Double
    ): Statistics = {
      val __obj = js.Dynamic.literal(brokenLinks = brokenLinks.asInstanceOf[js.Any], differences = differences.asInstanceOf[js.Any], differencesDirs = differencesDirs.asInstanceOf[js.Any], differencesFiles = differencesFiles.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], distinctDirs = distinctDirs.asInstanceOf[js.Any], distinctFiles = distinctFiles.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], equalDirs = equalDirs.asInstanceOf[js.Any], equalFiles = equalFiles.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftDirs = leftDirs.asInstanceOf[js.Any], leftFiles = leftFiles.asInstanceOf[js.Any], permissionDenied = permissionDenied.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rightDirs = rightDirs.asInstanceOf[js.Any], rightFiles = rightFiles.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalDirs = totalDirs.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statistics]
    }
    
    extension [Self <: Statistics](x: Self) {
      
      inline def setDifferences(value: Double): Self = StObject.set(x, "differences", value.asInstanceOf[js.Any])
      
      inline def setDifferencesDirs(value: Double): Self = StObject.set(x, "differencesDirs", value.asInstanceOf[js.Any])
      
      inline def setDifferencesFiles(value: Double): Self = StObject.set(x, "differencesFiles", value.asInstanceOf[js.Any])
      
      inline def setSame(value: Boolean): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalDirs(value: Double): Self = StObject.set(x, "totalDirs", value.asInstanceOf[js.Any])
      
      inline def setTotalFiles(value: Double): Self = StObject.set(x, "totalFiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymlinkStatistics extends StObject {
    
    /**
      * Total number of different links (distinctSymlinks+leftSymlinks+rightSymlinks).
      */
    var differencesSymlinks: Double
    
    /**
      * Number of distinct links.
      */
    var distinctSymlinks: Double
    
    /**
      * Number of equal links.
      */
    var equalSymlinks: Double
    
    /**
      * Number of links only in path1.
      */
    var leftSymlinks: Double
    
    /**
      * Number of links only in path2
      */
    var rightSymlinks: Double
    
    /**
      * Total number of links (differencesSymlinks+equalSymlinks).
      */
    var totalSymlinks: Double
  }
  object SymlinkStatistics {
    
    inline def apply(
      differencesSymlinks: Double,
      distinctSymlinks: Double,
      equalSymlinks: Double,
      leftSymlinks: Double,
      rightSymlinks: Double,
      totalSymlinks: Double
    ): SymlinkStatistics = {
      val __obj = js.Dynamic.literal(differencesSymlinks = differencesSymlinks.asInstanceOf[js.Any], distinctSymlinks = distinctSymlinks.asInstanceOf[js.Any], equalSymlinks = equalSymlinks.asInstanceOf[js.Any], leftSymlinks = leftSymlinks.asInstanceOf[js.Any], rightSymlinks = rightSymlinks.asInstanceOf[js.Any], totalSymlinks = totalSymlinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymlinkStatistics]
    }
    
    extension [Self <: SymlinkStatistics](x: Self) {
      
      inline def setDifferencesSymlinks(value: Double): Self = StObject.set(x, "differencesSymlinks", value.asInstanceOf[js.Any])
      
      inline def setDistinctSymlinks(value: Double): Self = StObject.set(x, "distinctSymlinks", value.asInstanceOf[js.Any])
      
      inline def setEqualSymlinks(value: Double): Self = StObject.set(x, "equalSymlinks", value.asInstanceOf[js.Any])
      
      inline def setLeftSymlinks(value: Double): Self = StObject.set(x, "leftSymlinks", value.asInstanceOf[js.Any])
      
      inline def setRightSymlinks(value: Double): Self = StObject.set(x, "rightSymlinks", value.asInstanceOf[js.Any])
      
      inline def setTotalSymlinks(value: Double): Self = StObject.set(x, "totalSymlinks", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Reason extends StObject
}
