package typings.gatsby.mod

import typings.gatsby.gatsbyStrings.UNION
import typings.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLUnionType extends GatsbyGraphQLType {
  var config: ComposeUnionTypeConfig[_, _]
  var kind: UNION
}

object GatsbyGraphQLUnionType {
  @scala.inline
  def apply(config: ComposeUnionTypeConfig[_, _], kind: UNION): GatsbyGraphQLUnionType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLUnionType]
  }
}

