package typings.emberData.mod.DS

import typings.emberArray.mutableMod.MutableArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `ManyArray` is a `MutableArray` that represents the contents of a has-many
  * relationship.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Ember.Object.extend(Ember.MutableArray as {}, Ember.Evented) * / any */ @JSImport("ember-data", "DS.ManyArray")
@js.native
class ManyArray[T] () extends MutableArray[T] {
  
  /**
    * Create a child record within the owner
    */
  def createRecord(): T = js.native
  def createRecord(inputProperties: js.Object): T = js.native
  
  /**
    * The loading state of this array
    */
  var isLoaded: Boolean = js.native
  
  /**
    * Reloads all of the records in the manyArray. If the manyArray
    * holds a relationship that was originally fetched using a links url
    * Ember Data will revisit the original links url to repopulate the
    * relationship.
    */
  def reload(): PromiseArray[T] = js.native
  
  /**
    * Saves all of the records in the `ManyArray`.
    */
  def save(): PromiseArray[T] = js.native
}
