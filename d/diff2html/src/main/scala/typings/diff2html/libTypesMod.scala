package typings.diff2html

import typings.diff2html.libTypesMod.LineType.CONTEXT
import typings.diff2html.libTypesMod.LineType.DELETE
import typings.diff2html.libTypesMod.LineType.INSERT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait LineType extends StObject
  @JSImport("diff2html/lib/types", "LineType")
  @js.native
  object LineType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LineType & String] = js.native
    
    @js.native
    sealed trait CONTEXT
      extends StObject
         with LineType
    /* "context" */ val CONTEXT: typings.diff2html.libTypesMod.LineType.CONTEXT & String = js.native
    
    @js.native
    sealed trait DELETE
      extends StObject
         with LineType
    /* "delete" */ val DELETE: typings.diff2html.libTypesMod.LineType.DELETE & String = js.native
    
    @js.native
    sealed trait INSERT
      extends StObject
         with LineType
    /* "insert" */ val INSERT: typings.diff2html.libTypesMod.LineType.INSERT & String = js.native
  }
  
  trait DiffBlock extends StObject {
    
    var header: String
    
    var lines: js.Array[DiffLine]
    
    var newStartLine: Double
    
    var oldStartLine: Double
    
    var oldStartLine2: js.UndefOr[Double] = js.undefined
  }
  object DiffBlock {
    
    inline def apply(header: String, lines: js.Array[DiffLine], newStartLine: Double, oldStartLine: Double): DiffBlock = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newStartLine = newStartLine.asInstanceOf[js.Any], oldStartLine = oldStartLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffBlock]
    }
    
    extension [Self <: DiffBlock](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setLines(value: js.Array[DiffLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: DiffLine*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setNewStartLine(value: Double): Self = StObject.set(x, "newStartLine", value.asInstanceOf[js.Any])
      
      inline def setOldStartLine(value: Double): Self = StObject.set(x, "oldStartLine", value.asInstanceOf[js.Any])
      
      inline def setOldStartLine2(value: Double): Self = StObject.set(x, "oldStartLine2", value.asInstanceOf[js.Any])
      
      inline def setOldStartLine2Undefined: Self = StObject.set(x, "oldStartLine2", js.undefined)
    }
  }
  
  trait DiffFile
    extends StObject
       with DiffFileName {
    
    var addedLines: Double
    
    var blocks: js.Array[DiffBlock]
    
    var changedPercentage: js.UndefOr[Double] = js.undefined
    
    var checksumAfter: js.UndefOr[String] = js.undefined
    
    var checksumBefore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var deletedFileMode: js.UndefOr[String] = js.undefined
    
    var deletedLines: Double
    
    var isBinary: js.UndefOr[Boolean] = js.undefined
    
    var isCombined: Boolean
    
    var isCopy: js.UndefOr[Boolean] = js.undefined
    
    var isDeleted: js.UndefOr[Boolean] = js.undefined
    
    var isGitDiff: Boolean
    
    var isNew: js.UndefOr[Boolean] = js.undefined
    
    var isRename: js.UndefOr[Boolean] = js.undefined
    
    var isTooBig: js.UndefOr[Boolean] = js.undefined
    
    var language: String
    
    var mode: js.UndefOr[String] = js.undefined
    
    var newFileMode: js.UndefOr[String] = js.undefined
    
    var newMode: js.UndefOr[String] = js.undefined
    
    var oldMode: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var unchangedPercentage: js.UndefOr[Double] = js.undefined
  }
  object DiffFile {
    
    inline def apply(
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
    
    extension [Self <: DiffFile](x: Self) {
      
      inline def setAddedLines(value: Double): Self = StObject.set(x, "addedLines", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: js.Array[DiffBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: DiffBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setChangedPercentage(value: Double): Self = StObject.set(x, "changedPercentage", value.asInstanceOf[js.Any])
      
      inline def setChangedPercentageUndefined: Self = StObject.set(x, "changedPercentage", js.undefined)
      
      inline def setChecksumAfter(value: String): Self = StObject.set(x, "checksumAfter", value.asInstanceOf[js.Any])
      
      inline def setChecksumAfterUndefined: Self = StObject.set(x, "checksumAfter", js.undefined)
      
      inline def setChecksumBefore(value: String | js.Array[String]): Self = StObject.set(x, "checksumBefore", value.asInstanceOf[js.Any])
      
      inline def setChecksumBeforeUndefined: Self = StObject.set(x, "checksumBefore", js.undefined)
      
      inline def setChecksumBeforeVarargs(value: String*): Self = StObject.set(x, "checksumBefore", js.Array(value*))
      
      inline def setDeletedFileMode(value: String): Self = StObject.set(x, "deletedFileMode", value.asInstanceOf[js.Any])
      
      inline def setDeletedFileModeUndefined: Self = StObject.set(x, "deletedFileMode", js.undefined)
      
      inline def setDeletedLines(value: Double): Self = StObject.set(x, "deletedLines", value.asInstanceOf[js.Any])
      
      inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
      
      inline def setIsBinaryUndefined: Self = StObject.set(x, "isBinary", js.undefined)
      
      inline def setIsCombined(value: Boolean): Self = StObject.set(x, "isCombined", value.asInstanceOf[js.Any])
      
      inline def setIsCopy(value: Boolean): Self = StObject.set(x, "isCopy", value.asInstanceOf[js.Any])
      
      inline def setIsCopyUndefined: Self = StObject.set(x, "isCopy", js.undefined)
      
      inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
      
      inline def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
      
      inline def setIsGitDiff(value: Boolean): Self = StObject.set(x, "isGitDiff", value.asInstanceOf[js.Any])
      
      inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
      
      inline def setIsNewUndefined: Self = StObject.set(x, "isNew", js.undefined)
      
      inline def setIsRename(value: Boolean): Self = StObject.set(x, "isRename", value.asInstanceOf[js.Any])
      
      inline def setIsRenameUndefined: Self = StObject.set(x, "isRename", js.undefined)
      
      inline def setIsTooBig(value: Boolean): Self = StObject.set(x, "isTooBig", value.asInstanceOf[js.Any])
      
      inline def setIsTooBigUndefined: Self = StObject.set(x, "isTooBig", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNewFileMode(value: String): Self = StObject.set(x, "newFileMode", value.asInstanceOf[js.Any])
      
      inline def setNewFileModeUndefined: Self = StObject.set(x, "newFileMode", js.undefined)
      
      inline def setNewMode(value: String): Self = StObject.set(x, "newMode", value.asInstanceOf[js.Any])
      
      inline def setNewModeUndefined: Self = StObject.set(x, "newMode", js.undefined)
      
      inline def setOldMode(value: String | js.Array[String]): Self = StObject.set(x, "oldMode", value.asInstanceOf[js.Any])
      
      inline def setOldModeUndefined: Self = StObject.set(x, "oldMode", js.undefined)
      
      inline def setOldModeVarargs(value: String*): Self = StObject.set(x, "oldMode", js.Array(value*))
      
      inline def setUnchangedPercentage(value: Double): Self = StObject.set(x, "unchangedPercentage", value.asInstanceOf[js.Any])
      
      inline def setUnchangedPercentageUndefined: Self = StObject.set(x, "unchangedPercentage", js.undefined)
    }
  }
  
  trait DiffFileName extends StObject {
    
    var newName: String
    
    var oldName: String
  }
  object DiffFileName {
    
    inline def apply(newName: String, oldName: String): DiffFileName = {
      val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffFileName]
    }
    
    extension [Self <: DiffFileName](x: Self) {
      
      inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
      
      inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    }
  }
  
  type DiffLine = (DiffLineDeleted & DiffLineContent) | (DiffLineInserted & DiffLineContent) | (DiffLineContext & DiffLineContent)
  
  trait DiffLineContent extends StObject {
    
    var content: String
  }
  object DiffLineContent {
    
    inline def apply(content: String): DiffLineContent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineContent]
    }
    
    extension [Self <: DiffLineContent](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffLineContext extends StObject {
    
    var newNumber: Double
    
    var oldNumber: Double
    
    var `type`: CONTEXT
  }
  object DiffLineContext {
    
    inline def apply(newNumber: Double, oldNumber: Double, `type`: CONTEXT): DiffLineContext = {
      val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineContext]
    }
    
    extension [Self <: DiffLineContext](x: Self) {
      
      inline def setNewNumber(value: Double): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      inline def setOldNumber(value: Double): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      inline def setType(value: CONTEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffLineDeleted extends StObject {
    
    var newNumber: Unit
    
    var oldNumber: Double
    
    var `type`: DELETE
  }
  object DiffLineDeleted {
    
    inline def apply(newNumber: Unit, oldNumber: Double, `type`: DELETE): DiffLineDeleted = {
      val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineDeleted]
    }
    
    extension [Self <: DiffLineDeleted](x: Self) {
      
      inline def setNewNumber(value: Unit): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      inline def setOldNumber(value: Double): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      inline def setType(value: DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffLineInserted extends StObject {
    
    var newNumber: Double
    
    var oldNumber: Unit
    
    var `type`: INSERT
  }
  object DiffLineInserted {
    
    inline def apply(newNumber: Double, oldNumber: Unit, `type`: INSERT): DiffLineInserted = {
      val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineInserted]
    }
    
    extension [Self <: DiffLineInserted](x: Self) {
      
      inline def setNewNumber(value: Double): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      inline def setOldNumber(value: Unit): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      inline def setType(value: INSERT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffLineParts extends StObject {
    
    var content: String
    
    var prefix: String
  }
  object DiffLineParts {
    
    inline def apply(content: String, prefix: String): DiffLineParts = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffLineParts]
    }
    
    extension [Self <: DiffLineParts](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
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
