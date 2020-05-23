package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the SchedulerGroupType enumeration.
  */
trait ASPxSchedulerGroupType extends js.Object {
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Date enumeration for use in client scripts.
    */
  var Date: String
  /**
    * Gets a string representation equivalent of SchedulerGroupType.None enumeration for use in client scripts.
    */
  var None: String
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Resource enumeration for use in client scripts.
    */
  var Resource: String
}

object ASPxSchedulerGroupType {
  @scala.inline
  def apply(Date: String, None: String, Resource: String): ASPxSchedulerGroupType = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSchedulerGroupType]
  }
}

