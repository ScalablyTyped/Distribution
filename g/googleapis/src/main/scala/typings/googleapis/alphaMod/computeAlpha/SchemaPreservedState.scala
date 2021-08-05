package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Preserved state for a given instance.
  */
trait SchemaPreservedState extends StObject {
  
  /**
    * Preserved disks defined for this instance. This map is keyed with the
    * device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedDisk]] = js.undefined
  
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaPreservedState {
  
  inline def apply(): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedState]
  }
  
  extension [Self <: SchemaPreservedState](x: Self) {
    
    inline def setDisks(value: StringDictionary[SchemaPreservedStatePreservedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
