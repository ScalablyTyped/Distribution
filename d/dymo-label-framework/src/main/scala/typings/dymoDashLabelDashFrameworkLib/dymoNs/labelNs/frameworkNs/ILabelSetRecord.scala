package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * ILabelSetRecord instance holds data of one LabelSet record. ILabelSetRecord provides
	 * methods for adding data to the record. To create ILabelSetRecord instance,
	 * use dymo.label.framework.LabelSetBuilder.prototype.addRecord method.
	 */
trait ILabelSetRecord extends js.Object {
  /**
  		 * Adds image data to the record.
  		 *
    	 * @param objectName The name of the object that the markup is set for.
    	 * @param base64Image The string containing the base64-encoded PNG image stream.
  		 *
  		 * @returns self
  		 */
  def setBase64Image(objectName: java.lang.String, base64Image: java.lang.String): ILabelSetRecord
  /** Adds data to the record specified as plain text.
  		 *
    * @param objectName The name of the object that the markup is set for.
    * @param text The object text to set.
  		 *
  		 * @returns self
  		 */
  def setText(objectName: java.lang.String, text: java.lang.String): ILabelSetRecord
  /**
  		 * Adds data to the record specified as text markup.
  		 *
  		 * @param objectName The name of the object that the markup is set for.
    	 * @param textMarkup The markup string. See [TextMarkup.xsd]{@link http://labelwriter.com/software/dls/sdk/TextMarkup.xsd}.
  		 *
  		 * @returns self
  		 */
  def setTextMarkup(objectName: java.lang.String, textMarkup: java.lang.String): ILabelSetRecord
}

object ILabelSetRecord {
  @scala.inline
  def apply(
    setBase64Image: (java.lang.String, java.lang.String) => ILabelSetRecord,
    setText: (java.lang.String, java.lang.String) => ILabelSetRecord,
    setTextMarkup: (java.lang.String, java.lang.String) => ILabelSetRecord
  ): ILabelSetRecord = {
    val __obj = js.Dynamic.literal(setBase64Image = js.Any.fromFunction2(setBase64Image), setText = js.Any.fromFunction2(setText), setTextMarkup = js.Any.fromFunction2(setTextMarkup))
  
    __obj.asInstanceOf[ILabelSetRecord]
  }
}

