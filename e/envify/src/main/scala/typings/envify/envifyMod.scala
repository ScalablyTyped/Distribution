package typings.envify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("envify", JSImport.Namespace)
@js.native
object envifyMod
  extends TopLevel[
      js.Function2[/* file */ String, /* environment */ StringDictionary[js.Any], ReadWriteStream]
    ]

