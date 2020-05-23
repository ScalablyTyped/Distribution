package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LabelSetBuilder is used to create a LabelSet to print multiple labels in one print job.
  * LabelSet is a collection of records. Each record contains multiple pairs; each pair consists
  * of the object name and the object text data/content. The data of each record are applied to all
  * corresponend objects and for each record one label is printed.
  */
trait LabelSetBuilder extends js.Object {
  /**
    * Adds a new record to the LabelSet. Returns a record object.
    */
  def addRecord(): ILabelSetRecord
  /**
    * Get all record objects in this LabelSetBuilder.
    */
  def getRecords(): js.Array[ILabelSetRecord]
}

object LabelSetBuilder {
  @scala.inline
  def apply(addRecord: () => ILabelSetRecord, getRecords: () => js.Array[ILabelSetRecord]): LabelSetBuilder = {
    val __obj = js.Dynamic.literal(addRecord = js.Any.fromFunction0(addRecord), getRecords = js.Any.fromFunction0(getRecords))
    __obj.asInstanceOf[LabelSetBuilder]
  }
}

