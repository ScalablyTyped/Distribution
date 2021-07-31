package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondDragDropProps extends StObject {
  
  /**
    * Require drop on the FilePond element itself to catch the file.
    * @default true
    */
  var dropOnElement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * FilePond will catch all files dropped on the webpage.
    * @default false
    */
  var dropOnPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled, files are validated before they are dropped.
    * A file is not added when it’s invalid.
    * @default false
    */
  var dropValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ignored file names when handling dropped directories.
    * Dropping directories is not supported on all browsers.
    * @default ['.ds_store', 'thumbs.db', 'desktop.ini']
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.undefined
}
object FilePondDragDropProps {
  
  @scala.inline
  def apply(): FilePondDragDropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondDragDropProps]
  }
  
  @scala.inline
  implicit class FilePondDragDropPropsMutableBuilder[Self <: FilePondDragDropProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropOnElement(value: Boolean): Self = StObject.set(x, "dropOnElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOnElementUndefined: Self = StObject.set(x, "dropOnElement", js.undefined)
    
    @scala.inline
    def setDropOnPage(value: Boolean): Self = StObject.set(x, "dropOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOnPageUndefined: Self = StObject.set(x, "dropOnPage", js.undefined)
    
    @scala.inline
    def setDropValidation(value: Boolean): Self = StObject.set(x, "dropValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropValidationUndefined: Self = StObject.set(x, "dropValidation", js.undefined)
    
    @scala.inline
    def setIgnoredFiles(value: js.Array[String]): Self = StObject.set(x, "ignoredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredFilesUndefined: Self = StObject.set(x, "ignoredFiles", js.undefined)
    
    @scala.inline
    def setIgnoredFilesVarargs(value: String*): Self = StObject.set(x, "ignoredFiles", js.Array(value :_*))
  }
}
