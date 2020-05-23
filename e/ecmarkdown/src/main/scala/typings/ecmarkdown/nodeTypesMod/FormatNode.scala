package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.pipe
import typings.ecmarkdown.ecmarkdownStrings.star
import typings.ecmarkdown.ecmarkdownStrings.tick
import typings.ecmarkdown.ecmarkdownStrings.tilde
import typings.ecmarkdown.ecmarkdownStrings.underscore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.StarNode
  - typings.ecmarkdown.nodeTypesMod.UnderscoreNode
  - typings.ecmarkdown.nodeTypesMod.TickNode
  - typings.ecmarkdown.nodeTypesMod.TildeNode
  - typings.ecmarkdown.nodeTypesMod.PipeNode
*/
trait FormatNode extends FragmentNode

object FormatNode {
  @scala.inline
  def PipeNode(
    contents: Null,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String,
    location: LocationRange = null
  ): FormatNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNode]
  }
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], name: tilde, location: LocationRange = null): FormatNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNode]
  }
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], name: star, location: LocationRange = null): FormatNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNode]
  }
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], name: underscore, location: LocationRange = null): FormatNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNode]
  }
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], name: tick, location: LocationRange = null): FormatNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNode]
  }
}

