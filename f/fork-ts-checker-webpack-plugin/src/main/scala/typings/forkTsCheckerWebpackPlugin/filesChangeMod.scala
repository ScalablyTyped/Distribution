package typings.forkTsCheckerWebpackPlugin

import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesChangeMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/files-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  inline def aggregateFilesChanges(changes: js.Array[FilesChange]): FilesChange = ^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFilesChanges")(changes.asInstanceOf[js.Any]).asInstanceOf[FilesChange]
  
  inline def clearFilesChange(compiler: Compiler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFilesChange")(compiler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def consumeFilesChange(compiler: Compiler): FilesChange = ^.asInstanceOf[js.Dynamic].applyDynamic("consumeFilesChange")(compiler.asInstanceOf[js.Any]).asInstanceOf[FilesChange]
  
  inline def getFilesChange(compiler: Compiler): FilesChange = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilesChange")(compiler.asInstanceOf[js.Any]).asInstanceOf[FilesChange]
  
  inline def updateFilesChange(compiler: Compiler, change: FilesChange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFilesChange")(compiler.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FilesChange extends StObject {
    
    var changedFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var deletedFiles: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FilesChange {
    
    inline def apply(): FilesChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilesChange]
    }
    
    extension [Self <: FilesChange](x: Self) {
      
      inline def setChangedFiles(value: js.Array[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
      
      inline def setChangedFilesVarargs(value: String*): Self = StObject.set(x, "changedFiles", js.Array(value*))
      
      inline def setDeletedFiles(value: js.Array[String]): Self = StObject.set(x, "deletedFiles", value.asInstanceOf[js.Any])
      
      inline def setDeletedFilesUndefined: Self = StObject.set(x, "deletedFiles", js.undefined)
      
      inline def setDeletedFilesVarargs(value: String*): Self = StObject.set(x, "deletedFiles", js.Array(value*))
    }
  }
}
