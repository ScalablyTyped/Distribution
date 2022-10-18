package typings.fineUploader.libCoreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraButtonsOptions extends StObject {
  
  /**
    * The container element for the upload button
    *
    * @default `undefined`
    */
  var element: HTMLElement
  
  /**
    * This value will be used when creating the `title` attribute for the underlying `<input type="file">`.
    *
    * If not provided, the `text.fileInputTitle` option will be used instead
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.undefined
  
  /**
    * `true` to allow folders to be selected, `false` to allow files to be selected.
    *
    * @default `false`
    */
  var folders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify to override the default `multiple` value
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify to override the default `validation` option specified.
    *
    * Any `validation` properties not specified will be inherited from the default `validation` option
    *
    * @default `validation`
    */
  var validation: js.UndefOr[Any] = js.undefined
}
object ExtraButtonsOptions {
  
  inline def apply(element: HTMLElement): ExtraButtonsOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraButtonsOptions]
  }
  
  extension [Self <: ExtraButtonsOptions](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFileInputTitle(value: String): Self = StObject.set(x, "fileInputTitle", value.asInstanceOf[js.Any])
    
    inline def setFileInputTitleUndefined: Self = StObject.set(x, "fileInputTitle", js.undefined)
    
    inline def setFolders(value: Boolean): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setValidation(value: Any): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
