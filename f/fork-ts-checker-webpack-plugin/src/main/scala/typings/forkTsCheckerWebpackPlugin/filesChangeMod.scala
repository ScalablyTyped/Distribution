package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesChangeMod {
  
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/FilesChange", "aggregateFilesChanges")
  @js.native
  def aggregateFilesChanges(changes: js.Array[FilesChange]): FilesChange = js.native
  
  @js.native
  trait FilesChange extends StObject {
    
    var changedFiles: js.UndefOr[js.Array[String]] = js.native
    
    var deletedFiles: js.UndefOr[js.Array[String]] = js.native
  }
  object FilesChange {
    
    @scala.inline
    def apply(): FilesChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilesChange]
    }
    
    @scala.inline
    implicit class FilesChangeMutableBuilder[Self <: FilesChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedFiles(value: js.Array[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
      
      @scala.inline
      def setChangedFilesVarargs(value: String*): Self = StObject.set(x, "changedFiles", js.Array(value :_*))
      
      @scala.inline
      def setDeletedFiles(value: js.Array[String]): Self = StObject.set(x, "deletedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedFilesUndefined: Self = StObject.set(x, "deletedFiles", js.undefined)
      
      @scala.inline
      def setDeletedFilesVarargs(value: String*): Self = StObject.set(x, "deletedFiles", js.Array(value :_*))
    }
  }
}
