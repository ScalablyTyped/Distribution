package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specified snapshot properties for scheduled snapshots created by this
  * policy.
  */
trait SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties extends StObject {
  
  /**
    * Indication to perform a ?guest aware? snapshot.
    */
  var guestFlush: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Labels to apply to scheduled snapshots. These can be later modified by
    * the setLabels method. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * GCS bucket storage location of the auto snapshot (regional or
    * multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties {
  
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicySnapshotPropertiesMutableBuilder[Self <: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value :_*))
  }
}
