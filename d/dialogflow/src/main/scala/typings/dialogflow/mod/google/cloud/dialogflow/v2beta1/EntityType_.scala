package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType")
@js.native
/**
  * Constructs a new EntityType.
  * @param [properties] Properties to set
  */
class EntityType_ () extends IEntityType {
  def this(properties: IEntityType) = this()
  /** EntityType autoExpansionMode. */
  @JSName("autoExpansionMode")
  var autoExpansionMode_EntityType_ : AutoExpansionMode = js.native
  /** EntityType displayName. */
  @JSName("displayName")
  var displayName_EntityType_ : String = js.native
  /** EntityType enableFuzzyExtraction. */
  @JSName("enableFuzzyExtraction")
  var enableFuzzyExtraction_EntityType_ : Boolean = js.native
  /** EntityType entities. */
  @JSName("entities")
  var entities_EntityType_ : js.Array[IEntity] = js.native
  /** EntityType kind. */
  @JSName("kind")
  var kind_EntityType_ : Kind = js.native
  /** EntityType name. */
  @JSName("name")
  var name_EntityType_ : String = js.native
  /**
    * Converts this EntityType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

