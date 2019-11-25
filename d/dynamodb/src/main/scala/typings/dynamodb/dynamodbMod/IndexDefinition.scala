package typings.dynamodb.dynamodbMod

import typings.dynamodb.dynamoDBMod.Projection
import typings.dynamodb.dynamodbStrings.global
import typings.dynamodb.dynamodbStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDefinition extends js.Object {
  var hashKey: String
  var name: String
  var projection: js.UndefOr[Projection] = js.undefined
  var rangeKey: js.UndefOr[String] = js.undefined
  var `type`: local | global
}

object IndexDefinition {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    `type`: local | global,
    projection: Projection = null,
    rangeKey: String = null
  ): IndexDefinition = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDefinition]
  }
}

