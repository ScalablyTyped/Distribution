package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatus extends StObject {
  
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a
    * stable state. A stable state means that: none of the instances in the
    * managed instance group is currently undergoing any type of change (for
    * example, creation, restart, or deletion); no future changes are scheduled
    * for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output Only] A status of consistency of Instances&#39; versions with
    * their target version specified by version field on Instance Group
    * Manager.
    */
  var versionTarget: js.UndefOr[SchemaInstanceGroupManagerStatusVersionTarget] = js.undefined
}
object SchemaInstanceGroupManagerStatus {
  
  inline def apply(): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatus](x: Self) {
    
    inline def setIsStable(value: Boolean): Self = StObject.set(x, "isStable", value.asInstanceOf[js.Any])
    
    inline def setIsStableUndefined: Self = StObject.set(x, "isStable", js.undefined)
    
    inline def setVersionTarget(value: SchemaInstanceGroupManagerStatusVersionTarget): Self = StObject.set(x, "versionTarget", value.asInstanceOf[js.Any])
    
    inline def setVersionTargetUndefined: Self = StObject.set(x, "versionTarget", js.undefined)
  }
}
