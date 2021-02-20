package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Preserved state for a given instance.
  */
@js.native
trait SchemaPreservedState extends StObject {
  
  /**
    * Preserved disks defined for this instance. This map is keyed with the
    * device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedDisk]] = js.native
  
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaPreservedState {
  
  @scala.inline
  def apply(): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedState]
  }
  
  @scala.inline
  implicit class SchemaPreservedStateMutableBuilder[Self <: SchemaPreservedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: StringDictionary[SchemaPreservedStatePreservedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
