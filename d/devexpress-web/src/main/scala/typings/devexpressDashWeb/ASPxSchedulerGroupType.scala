package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the SchedulerGroupType enumeration.
  */
trait ASPxSchedulerGroupType extends js.Object {
  /**
    * Gets a string representation equivalent of Date enumeration for use in client scripts.
    * Value: A "Date" string value.
    */
  var Date: String
  /**
    * Gets a string representation equivalent of None enumeration for use in client scripts.
    * Value: A "None" string value.
    */
  var None: String
  /**
    * Gets a string representation equivalent of Resource enumeration for use in client scripts.
    * Value: A "Resource" string value.
    */
  var Resource: String
}

object ASPxSchedulerGroupType {
  @scala.inline
  def apply(Date: String, None: String, Resource: String): ASPxSchedulerGroupType = {
    val __obj = js.Dynamic.literal(Date = Date, None = None, Resource = Resource)
  
    __obj.asInstanceOf[ASPxSchedulerGroupType]
  }
}

