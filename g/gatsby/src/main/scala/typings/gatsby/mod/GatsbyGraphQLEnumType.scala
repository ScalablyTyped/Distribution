package typings.gatsby.mod

import typings.gatsby.gatsbyStrings.ENUM
import typings.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLEnumType extends GatsbyGraphQLType {
  var config: ComposeEnumTypeConfig
  var kind: ENUM
}

object GatsbyGraphQLEnumType {
  @scala.inline
  def apply(config: ComposeEnumTypeConfig, kind: ENUM): GatsbyGraphQLEnumType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLEnumType]
  }
}

