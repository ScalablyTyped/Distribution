package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebEntity extends js.Object {
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Opaque entity ID. */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overall relevancy score for the entity.
    * Not normalized and not comparable across different image queries.
    */
  var score: js.UndefOr[scala.Double] = js.undefined
}

