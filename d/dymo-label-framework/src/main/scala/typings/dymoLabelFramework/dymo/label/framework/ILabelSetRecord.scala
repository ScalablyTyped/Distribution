package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ILabelSetRecord instance holds data of one LabelSet record. ILabelSetRecord provides
  * methods for adding data to the record. To create ILabelSetRecord instance,
  * use dymo.label.framework.LabelSetBuilder.prototype.addRecord method.
  */
@js.native
trait ILabelSetRecord extends js.Object {
  /**
    * Adds image data to the record.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param base64Image The string containing the base64-encoded PNG image stream.
    *
    * @returns self
    */
  def setBase64Image(objectName: String, base64Image: String): ILabelSetRecord = js.native
  /** Adds data to the record specified as plain text.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param text The object text to set.
    *
    * @returns self
    */
  def setText(objectName: String, text: String): ILabelSetRecord = js.native
  /**
    * Adds data to the record specified as text markup.
    *
    * @param objectName The name of the object that the markup is set for.
    * @param textMarkup The markup string. See [TextMarkup.xsd]{@link http://labelwriter.com/software/dls/sdk/TextMarkup.xsd}.
    *
    * @returns self
    */
  def setTextMarkup(objectName: String, textMarkup: String): ILabelSetRecord = js.native
}

object ILabelSetRecord {
  @scala.inline
  def apply(
    setBase64Image: (String, String) => ILabelSetRecord,
    setText: (String, String) => ILabelSetRecord,
    setTextMarkup: (String, String) => ILabelSetRecord
  ): ILabelSetRecord = {
    val __obj = js.Dynamic.literal(setBase64Image = js.Any.fromFunction2(setBase64Image), setText = js.Any.fromFunction2(setText), setTextMarkup = js.Any.fromFunction2(setTextMarkup))
    __obj.asInstanceOf[ILabelSetRecord]
  }
  @scala.inline
  implicit class ILabelSetRecordOps[Self <: ILabelSetRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetBase64Image(value: (String, String) => ILabelSetRecord): Self = this.set("setBase64Image", js.Any.fromFunction2(value))
    @scala.inline
    def setSetText(value: (String, String) => ILabelSetRecord): Self = this.set("setText", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTextMarkup(value: (String, String) => ILabelSetRecord): Self = this.set("setTextMarkup", js.Any.fromFunction2(value))
  }
  
}

