package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gatsby.gatsbyStrings.develop
  - typings.gatsby.gatsbyStrings.`develop-html`
  - typings.gatsby.gatsbyStrings.`build-javascript`
  - typings.gatsby.gatsbyStrings.`build-html`
*/
trait GatsbyStages extends js.Object

object GatsbyStages {
  @scala.inline
  def `build-html`: typings.gatsby.gatsbyStrings.`build-html` = this.cast("build-html")
  @scala.inline
  def `build-javascript`: typings.gatsby.gatsbyStrings.`build-javascript` = this.cast("build-javascript")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typings.gatsby.gatsbyStrings.develop = this.cast("develop")
  @scala.inline
  def `develop-html`: typings.gatsby.gatsbyStrings.`develop-html` = this.cast("develop-html")
}

