package typings.formidable

import org.scalablytyped.runtime.Instantiable3
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  FormidableError :new (message : string, internalCode : number, httpCode : number | undefined): formidable.formidable/FormidableError.FormidableError} & std.Record<'missingPlugin' | 'pluginFunction' | 'aborted' | 'noParser' | 'uninitializedParser' | 'filenameNotString' | 'maxFieldsSizeExceeded' | 'maxFieldsExceeded' | 'smallerThanMinFileSize' | 'biggerThanMaxFileSize' | 'noEmptyFiles' | 'missingContentType' | 'malformedMultipart' | 'missingMultipartBoundary' | 'unknownTransferEncoding', number> */
object formidableErrorMod {
  
  @JSImport("formidable/FormidableError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormidableError
    extends StObject
       with Error {
    
    var httpCode: js.UndefOr[Double] = js.undefined
    
    var internalCode: Double
  }
  object FormidableError {
    
    @JSImport("formidable/FormidableError", "FormidableError")
    @js.native
    val ^ : Instantiable3[
        /* message */ String, 
        /* internalCode */ Double, 
        /* httpCode */ js.UndefOr[Double], 
        FormidableError
      ] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormidableError] (val x: Self) extends AnyVal {
      
      inline def setHttpCode(value: Double): Self = StObject.set(x, "httpCode", value.asInstanceOf[js.Any])
      
      inline def setHttpCodeUndefined: Self = StObject.set(x, "httpCode", js.undefined)
      
      inline def setInternalCode(value: Double): Self = StObject.set(x, "internalCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("formidable/FormidableError", "FormidableError")
  @js.native
  open class FormidableErrorCls protected ()
    extends StObject
       with FormidableError {
    def this(message: String, internalCode: Double) = this()
    def this(message: String, internalCode: Double, httpCode: Double) = this()
    
    /* CompleteClass */
    var internalCode: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("formidable/FormidableError", "aborted")
  @js.native
  def aborted: Double = js.native
  inline def aborted_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aborted")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "biggerThanMaxFileSize")
  @js.native
  def biggerThanMaxFileSize: Double = js.native
  inline def biggerThanMaxFileSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("biggerThanMaxFileSize")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "filenameNotString")
  @js.native
  def filenameNotString: Double = js.native
  inline def filenameNotString_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filenameNotString")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "malformedMultipart")
  @js.native
  def malformedMultipart: Double = js.native
  inline def malformedMultipart_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("malformedMultipart")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "maxFieldsExceeded")
  @js.native
  def maxFieldsExceeded: Double = js.native
  inline def maxFieldsExceeded_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsExceeded")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "maxFieldsSizeExceeded")
  @js.native
  def maxFieldsSizeExceeded: Double = js.native
  inline def maxFieldsSizeExceeded_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSizeExceeded")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "missingContentType")
  @js.native
  def missingContentType: Double = js.native
  inline def missingContentType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingContentType")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "missingMultipartBoundary")
  @js.native
  def missingMultipartBoundary: Double = js.native
  inline def missingMultipartBoundary_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingMultipartBoundary")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "missingPlugin")
  @js.native
  def missingPlugin: Double = js.native
  inline def missingPlugin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingPlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "noEmptyFiles")
  @js.native
  def noEmptyFiles: Double = js.native
  inline def noEmptyFiles_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noEmptyFiles")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "noParser")
  @js.native
  def noParser: Double = js.native
  inline def noParser_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noParser")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "pluginFunction")
  @js.native
  def pluginFunction: Double = js.native
  inline def pluginFunction_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "smallerThanMinFileSize")
  @js.native
  def smallerThanMinFileSize: Double = js.native
  inline def smallerThanMinFileSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smallerThanMinFileSize")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "uninitializedParser")
  @js.native
  def uninitializedParser: Double = js.native
  inline def uninitializedParser_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uninitializedParser")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable/FormidableError", "unknownTransferEncoding")
  @js.native
  def unknownTransferEncoding: Double = js.native
  inline def unknownTransferEncoding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknownTransferEncoding")(x.asInstanceOf[js.Any])
}
