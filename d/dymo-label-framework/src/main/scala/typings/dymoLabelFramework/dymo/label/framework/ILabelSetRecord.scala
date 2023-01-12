package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ILabelSetRecord instance holds data of one LabelSet record. ILabelSetRecord provides
  * methods for adding data to the record. To create ILabelSetRecord instance,
  * use dymo.label.framework.LabelSetBuilder.prototype.addRecord method.
  */
trait ILabelSetRecord extends StObject {
  
  /**
    * Adds image data to the record.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param base64Image The string containing the base64-encoded PNG image stream.
    *
    * @returns self
    */
  def setBase64Image(objectName: String, base64Image: String): ILabelSetRecord
  
  /** Adds data to the record specified as plain text.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param text The object text to set.
    *
    * @returns self
    */
  def setText(objectName: String, text: String): ILabelSetRecord
  
  /**
    * Adds data to the record specified as text markup.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param textMarkup The markup string. See [TextMarkup.xsd]{@link http://labelwriter.com/software/dls/sdk/TextMarkup.xsd}.
    *
    * @returns self
    */
  def setTextMarkup(objectName: String, textMarkup: String): ILabelSetRecord
}
object ILabelSetRecord {
  
  inline def apply(
    setBase64Image: (String, String) => ILabelSetRecord,
    setText: (String, String) => ILabelSetRecord,
    setTextMarkup: (String, String) => ILabelSetRecord
  ): ILabelSetRecord = {
    val __obj = js.Dynamic.literal(setBase64Image = js.Any.fromFunction2(setBase64Image), setText = js.Any.fromFunction2(setText), setTextMarkup = js.Any.fromFunction2(setTextMarkup))
    __obj.asInstanceOf[ILabelSetRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILabelSetRecord] (val x: Self) extends AnyVal {
    
    inline def setSetBase64Image(value: (String, String) => ILabelSetRecord): Self = StObject.set(x, "setBase64Image", js.Any.fromFunction2(value))
    
    inline def setSetText(value: (String, String) => ILabelSetRecord): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
    
    inline def setSetTextMarkup(value: (String, String) => ILabelSetRecord): Self = StObject.set(x, "setTextMarkup", js.Any.fromFunction2(value))
  }
}
