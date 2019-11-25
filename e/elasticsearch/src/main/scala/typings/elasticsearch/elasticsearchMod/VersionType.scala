package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticsearch.elasticsearchStrings.internal
  - typings.elasticsearch.elasticsearchStrings.external
  - typings.elasticsearch.elasticsearchStrings.external_gte
  - typings.elasticsearch.elasticsearchStrings.force
*/
trait VersionType extends js.Object

object VersionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typings.elasticsearch.elasticsearchStrings.external = this.cast("external")
  @scala.inline
  def external_gte: typings.elasticsearch.elasticsearchStrings.external_gte = this.cast("external_gte")
  @scala.inline
  def force: typings.elasticsearch.elasticsearchStrings.force = this.cast("force")
  @scala.inline
  def internal: typings.elasticsearch.elasticsearchStrings.internal = this.cast("internal")
}

