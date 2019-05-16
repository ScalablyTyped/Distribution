package typings
package dynamodbLib.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDefinition extends js.Object {
  var hashKey: java.lang.String
  var name: java.lang.String
  var projection: js.UndefOr[dynamodbLib.dynamoDBMod.Projection] = js.undefined
  var rangeKey: js.UndefOr[java.lang.String] = js.undefined
  var `type`: dynamodbLib.dynamodbLibStrings.local | dynamodbLib.dynamodbLibStrings.global
}

object IndexDefinition {
  @scala.inline
  def apply(
    hashKey: java.lang.String,
    name: java.lang.String,
    `type`: dynamodbLib.dynamodbLibStrings.local | dynamodbLib.dynamodbLibStrings.global,
    projection: dynamodbLib.dynamoDBMod.Projection = null,
    rangeKey: java.lang.String = null
  ): IndexDefinition = {
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    __obj.asInstanceOf[IndexDefinition]
  }
}

