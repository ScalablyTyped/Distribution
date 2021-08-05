package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about changes in an object&#39;s parents as a result
  * of a move type event.
  */
trait SchemaMove extends StObject {
  
  /**
    * The added parent(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaParent]] = js.undefined
  
  /**
    * The removed parent(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaParent]] = js.undefined
}
object SchemaMove {
  
  inline def apply(): SchemaMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMove]
  }
  
  extension [Self <: SchemaMove](x: Self) {
    
    inline def setAddedParents(value: js.Array[SchemaParent]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
    
    inline def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
    
    inline def setAddedParentsVarargs(value: SchemaParent*): Self = StObject.set(x, "addedParents", js.Array(value :_*))
    
    inline def setRemovedParents(value: js.Array[SchemaParent]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
    
    inline def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
    
    inline def setRemovedParentsVarargs(value: SchemaParent*): Self = StObject.set(x, "removedParents", js.Array(value :_*))
  }
}
