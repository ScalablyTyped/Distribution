package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tag extends js.Object {
  /** The description of the thing this tag is documenting. */
  var description: java.lang.String | scala.Null
  /** Any errors that were encountered in parsing the tag. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the thing this tag is documenting, if any. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the jsdoc tag. e.g. `@foo` will have a title of 'foo'. */
  var title: java.lang.String
  /** The type of the thing this tag is documenting. */
  var `type`: js.UndefOr[Type | scala.Null] = js.undefined
}

