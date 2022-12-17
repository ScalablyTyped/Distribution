package typings.globby

import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.outTypesMod.Pattern
import typings.globby.mod.ExpandDirectoriesOption
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Extensions {
    
    inline def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    extension [Self <: Extensions](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  /* Inlined globby.globby.FastGlobOptionsWithoutCwd & { readonly cwd :node.node:url.URL | string | undefined} */
  trait FastGlobOptionsWithoutCwd extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var baseNameMatch: js.UndefOr[Boolean] = js.undefined
    
    var braceExpansion: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    		The current working directory in which to search.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[URL | String] = js.undefined
    
    var deep: js.UndefOr[Double] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    var globstar: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    var markDirectories: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var onlyDirectories: js.UndefOr[Boolean] = js.undefined
    
    var onlyFiles: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object FastGlobOptionsWithoutCwd {
    
    inline def apply(): FastGlobOptionsWithoutCwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastGlobOptionsWithoutCwd]
    }
    
    extension [Self <: FastGlobOptionsWithoutCwd](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  /* Inlined globby.globby.Options & {  objectMode :true} */
  trait OptionsobjectModetrue extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var baseNameMatch: js.UndefOr[Boolean] = js.undefined
    
    var braceExpansion: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    	The current working directory in which to search.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[URL | String] = js.undefined
    
    var deep: js.UndefOr[Double] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
    	If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
    	Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
    	@default true
    	@example
    	```
    	import {globby} from 'globby';
    	const paths = await globby('images', {
    		expandDirectories: {
    			files: ['cat', 'unicorn', '*.jpg'],
    			extensions: ['png']
    		}
    	});
    	console.log(paths);
    	//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
    	```
    	*/
    val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    /**
    	Respect ignore patterns in `.gitignore` files that apply to the globbed files.
    	@default false
    	*/
    val gitignore: js.UndefOr[Boolean] = js.undefined
    
    var globstar: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    /**
    	Glob patterns to look for ignore files, which are then used to ignore globbed files.
    	This is a more generic form of the `gitignore` option, allowing you to find ignore files with a [compatible syntax](http://git-scm.com/docs/gitignore). For instance, this works with Babel's `.babelignore`, Prettier's `.prettierignore`, or ESLint's `.eslintignore` files.
    	@default undefined
    	*/
    val ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var markDirectories: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var onlyDirectories: js.UndefOr[Boolean] = js.undefined
    
    var onlyFiles: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsobjectModetrue {
    
    inline def apply(): OptionsobjectModetrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsobjectModetrue]
    }
    
    extension [Self <: OptionsobjectModetrue](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExpandDirectories(value: ExpandDirectoriesOption): Self = StObject.set(x, "expandDirectories", value.asInstanceOf[js.Any])
      
      inline def setExpandDirectoriesUndefined: Self = StObject.set(x, "expandDirectories", js.undefined)
      
      inline def setExpandDirectoriesVarargs(value: String*): Self = StObject.set(x, "expandDirectories", js.Array(value*))
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGitignore(value: Boolean): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setGitignoreUndefined: Self = StObject.set(x, "gitignore", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}
