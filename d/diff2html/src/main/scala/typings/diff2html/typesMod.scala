package typings.diff2html

import typings.diff2html.typesMod.LineType.CONTEXT
import typings.diff2html.typesMod.LineType.DELETE
import typings.diff2html.typesMod.LineType.INSERT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait LineType extends StObject
  @JSImport("diff2html/lib/types", "LineType")
  @js.native
  object LineType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LineType with String] = js.native
    
    @js.native
    sealed trait CONTEXT extends LineType
    /* "context" */ val CONTEXT: typings.diff2html.typesMod.LineType.CONTEXT with String = js.native
    
    @js.native
    sealed trait DELETE extends LineType
    /* "delete" */ val DELETE: typings.diff2html.typesMod.LineType.DELETE with String = js.native
    
    @js.native
    sealed trait INSERT extends LineType
    /* "insert" */ val INSERT: typings.diff2html.typesMod.LineType.INSERT with String = js.native
  }
  
  @js.native
  trait DiffBlock extends StObject {
    
    var header: String = js.native
    
    var lines: js.Array[DiffLine] = js.native
    
    var newStartLine: Double = js.native
    
    var oldStartLine: Double = js.native
    
    var oldStartLine2: js.UndefOr[Double] = js.native
  }
  object DiffBlock {
    
    @scala.inline
    def apply(header: String, lines: js.Array[DiffLine], newStartLine: Double, oldStartLine: Double): DiffBlock = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newStartLine = newStartLine.asInstanceOf[js.Any], oldStartLine = oldStartLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffBlock]
    }
    
    @scala.inline
    implicit class DiffBlockMutableBuilder[Self <: DiffBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[DiffLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: DiffLine*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setNewStartLine(value: Double): Self = StObject.set(x, "newStartLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldStartLine(value: Double): Self = StObject.set(x, "oldStartLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldStartLine2(value: Double): Self = StObject.set(x, "oldStartLine2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldStartLine2Undefined: Self = StObject.set(x, "oldStartLine2", js.undefined)
    }
  }
  
  @js.native
  trait DiffFile extends DiffFileName {
    
    var addedLines: Double = js.native
    
    var blocks: js.Array[DiffBlock] = js.native
    
    var changedPercentage: js.UndefOr[Double] = js.native
    
    var checksumAfter: js.UndefOr[String] = js.native
    
    var checksumBefore: js.UndefOr[String | js.Array[String]] = js.native
    
    var deletedFileMode: js.UndefOr[String] = js.native
    
    var deletedLines: Double = js.native
    
    var isBinary: js.UndefOr[Boolean] = js.native
    
    var isCombined: Boolean = js.native
    
    var isCopy: js.UndefOr[Boolean] = js.native
    
    var isDeleted: js.UndefOr[Boolean] = js.native
    
    var isGitDiff: Boolean = js.native
    
    var isNew: js.UndefOr[Boolean] = js.native
    
    var isRename: js.UndefOr[Boolean] = js.native
    
    var language: String = js.native
    
    var mode: js.UndefOr[String] = js.native
    
    var newFileMode: js.UndefOr[String] = js.native
    
    var newMode: js.UndefOr[String] = js.native
    
    var oldMode: js.UndefOr[String | js.Array[String]] = js.native
    
    var unchangedPercentage: js.UndefOr[Double] = js.native
  }
  object DiffFile {
    
    @scala.inline
    def apply(
      addedLines: Double,
      blocks: js.Array[DiffBlock],
      deletedLines: Double,
      isCombined: Boolean,
      isGitDiff: Boolean,
      language: String,
      newName: String,
      oldName: String
    ): DiffFile = {
      val __obj = js.Dynamic.literal(addedLines = addedLines.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], deletedLines = deletedLines.asInstanceOf[js.Any], isCombined = isCombined.asInstanceOf[js.Any], isGitDiff = isGitDiff.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffFile]
    }
    
    @scala.inline
    implicit class DiffFileMutableBuilder[Self <: DiffFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddedLines(value: Double): Self = StObject.set(x, "addedLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocks(value: js.Array[DiffBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksVarargs(value: DiffBlock*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setChangedPercentage(value: Double): Self = StObject.set(x, "changedPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedPercentageUndefined: Self = StObject.set(x, "changedPercentage", js.undefined)
      
      @scala.inline
      def setChecksumAfter(value: String): Self = StObject.set(x, "checksumAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumAfterUndefined: Self = StObject.set(x, "checksumAfter", js.undefined)
      
      @scala.inline
      def setChecksumBefore(value: String | js.Array[String]): Self = StObject.set(x, "checksumBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumBeforeUndefined: Self = StObject.set(x, "checksumBefore", js.undefined)
      
      @scala.inline
      def setChecksumBeforeVarargs(value: String*): Self = StObject.set(x, "checksumBefore", js.Array(value :_*))
      
      @scala.inline
      def setDeletedFileMode(value: String): Self = StObject.set(x, "deletedFileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedFileModeUndefined: Self = StObject.set(x, "deletedFileMode", js.undefined)
      
      @scala.inline
      def setDeletedLines(value: Double): Self = StObject.set(x, "deletedLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBinaryUndefined: Self = StObject.set(x, "isBinary", js.undefined)
      
      @scala.inline
      def setIsCombined(value: Boolean): Self = StObject.set(x, "isCombined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCopy(value: Boolean): Self = StObject.set(x, "isCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCopyUndefined: Self = StObject.set(x, "isCopy", js.undefined)
      
      @scala.inline
      def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
      
      @scala.inline
      def setIsGitDiff(value: Boolean): Self = StObject.set(x, "isGitDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNewUndefined: Self = StObject.set(x, "isNew", js.undefined)
      
      @scala.inline
      def setIsRename(value: Boolean): Self = StObject.set(x, "isRename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRenameUndefined: Self = StObject.set(x, "isRename", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNewFileMode(value: String): Self = StObject.set(x, "newFileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewFileModeUndefined: Self = StObject.set(x, "newFileMode", js.undefined)
      
      @scala.inline
      def setNewMode(value: String): Self = StObject.set(x, "newMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewModeUndefined: Self = StObject.set(x, "newMode", js.undefined)
      
      @scala.inline
      def setOldMode(value: String | js.Array[String]): Self = StObject.set(x, "oldMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldModeUndefined: Self = StObject.set(x, "oldMode", js.undefined)
      
      @scala.inline
      def setOldModeVarargs(value: String*): Self = StObject.set(x, "oldMode", js.Array(value :_*))
      
      @scala.inline
      def setUnchangedPercentage(value: Double): Self = StObject.set(x, "unchangedPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnchangedPercentageUndefined: Self = StObject.set(x, "unchangedPercentage", js.undefined)
    }
  }
  
  @js.native
  trait DiffFileName extends StObject {
    
    var newName: String = js.native
    
    var oldName: String = js.native
  }
  object DiffFileName {
    
    @scala.inline
    def apply(newName: String, oldName: String): DiffFileName = {
      val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffFileName]
    }
    
    @scala.inline
    implicit class DiffFileNameMutableBuilder[Self <: DiffFileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    }
  }
  
  type DiffLine = (DiffLineDeleted | DiffLineInserted | DiffLineContext) with DiffLineContent
  
  @js.native
  trait DiffLineContent extends StObject {
    
    var content: String = js.native
  }
  object DiffLineContent {
    
    @scala.inline
    def apply(content: String): DiffLineContent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineContent]
    }
    
    @scala.inline
    implicit class DiffLineContentMutableBuilder[Self <: DiffLineContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffLineContext extends StObject {
    
    var newNumber: Double = js.native
    
    var oldNumber: Double = js.native
    
    var `type`: CONTEXT = js.native
  }
  object DiffLineContext {
    
    @scala.inline
    def apply(newNumber: Double, oldNumber: Double, `type`: CONTEXT): DiffLineContext = {
      val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineContext]
    }
    
    @scala.inline
    implicit class DiffLineContextMutableBuilder[Self <: DiffLineContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewNumber(value: Double): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNumber(value: Double): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CONTEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffLineDeleted extends StObject {
    
    var newNumber: js.UndefOr[scala.Nothing] = js.native
    
    var oldNumber: Double = js.native
    
    var `type`: DELETE = js.native
  }
  object DiffLineDeleted {
    
    @scala.inline
    def apply(oldNumber: Double, `type`: DELETE): DiffLineDeleted = {
      val __obj = js.Dynamic.literal(oldNumber = oldNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineDeleted]
    }
    
    @scala.inline
    implicit class DiffLineDeletedMutableBuilder[Self <: DiffLineDeleted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldNumber(value: Double): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffLineInserted extends StObject {
    
    var newNumber: Double = js.native
    
    var oldNumber: js.UndefOr[scala.Nothing] = js.native
    
    var `type`: INSERT = js.native
  }
  object DiffLineInserted {
    
    @scala.inline
    def apply(newNumber: Double, `type`: INSERT): DiffLineInserted = {
      val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineInserted]
    }
    
    @scala.inline
    implicit class DiffLineInsertedMutableBuilder[Self <: DiffLineInserted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewNumber(value: Double): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: INSERT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffLineParts extends StObject {
    
    var content: String = js.native
    
    var prefix: String = js.native
  }
  object DiffLineParts {
    
    @scala.inline
    def apply(content: String, prefix: String): DiffLineParts = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineParts]
    }
    
    @scala.inline
    implicit class DiffLinePartsMutableBuilder[Self <: DiffLineParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.diff2html.diff2htmlStrings.word
    - typings.diff2html.diff2htmlStrings.char
  */
  trait DiffStyleType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.diff2html.diff2htmlStrings.lines
    - typings.diff2html.diff2htmlStrings.words
    - typings.diff2html.diff2htmlStrings.none
  */
  trait LineMatchingType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.diff2html.diff2htmlStrings.`line-by-line`
    - typings.diff2html.diff2htmlStrings.`side-by-side`
  */
  trait OutputFormatType extends StObject
}
