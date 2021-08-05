package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a planned outage on this Interconnect. Next id: 9
  */
trait SchemaInterconnectOutageNotification extends StObject {
  
  /**
    * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs
    * that will be affected.
    */
  var affectedCircuits: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A description about the purpose of the outage.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Scheduled end time for the outage (milliseconds since Unix epoch).
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Form this outage is expected to take. Note that the &quot;IT_&quot;
    * versions of this enum have been deprecated in favor of the unprefixed
    * values.
    */
  var issueType: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for this outage notification.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The party that generated this notification. Note that
    * &quot;NSRC_GOOGLE&quot; has been deprecated in favor of
    * &quot;GOOGLE&quot;
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Scheduled start time for the outage (milliseconds since Unix epoch).
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * State of this notification. Note that the &quot;NS_&quot; versions of
    * this enum have been deprecated in favor of the unprefixed values.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaInterconnectOutageNotification {
  
  inline def apply(): SchemaInterconnectOutageNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectOutageNotification]
  }
  
  extension [Self <: SchemaInterconnectOutageNotification](x: Self) {
    
    inline def setAffectedCircuits(value: js.Array[String]): Self = StObject.set(x, "affectedCircuits", value.asInstanceOf[js.Any])
    
    inline def setAffectedCircuitsUndefined: Self = StObject.set(x, "affectedCircuits", js.undefined)
    
    inline def setAffectedCircuitsVarargs(value: String*): Self = StObject.set(x, "affectedCircuits", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIssueType(value: String): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
