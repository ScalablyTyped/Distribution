package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a planned outage on this Interconnect. Next id: 9
  */
@js.native
trait SchemaInterconnectOutageNotification extends js.Object {
  
  /**
    * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs
    * that will be affected.
    */
  var affectedCircuits: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A description about the purpose of the outage.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Scheduled end time for the outage (milliseconds since Unix epoch).
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Form this outage is expected to take. Note that the &quot;IT_&quot;
    * versions of this enum have been deprecated in favor of the unprefixed
    * values.
    */
  var issueType: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier for this outage notification.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The party that generated this notification. Note that
    * &quot;NSRC_GOOGLE&quot; has been deprecated in favor of
    * &quot;GOOGLE&quot;
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Scheduled start time for the outage (milliseconds since Unix epoch).
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * State of this notification. Note that the &quot;NS_&quot; versions of
    * this enum have been deprecated in favor of the unprefixed values.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaInterconnectOutageNotification {
  
  @scala.inline
  def apply(): SchemaInterconnectOutageNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectOutageNotification]
  }
  
  @scala.inline
  implicit class SchemaInterconnectOutageNotificationOps[Self <: SchemaInterconnectOutageNotification] (val x: Self) extends AnyVal {
    
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
    def setAffectedCircuitsVarargs(value: String*): Self = this.set("affectedCircuits", js.Array(value :_*))
    
    @scala.inline
    def setAffectedCircuits(value: js.Array[String]): Self = this.set("affectedCircuits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffectedCircuits: Self = this.set("affectedCircuits", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setIssueType(value: String): Self = this.set("issueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueType: Self = this.set("issueType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
