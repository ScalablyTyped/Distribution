package typings.gatsbyCoreUtils

import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createContentDigestMod {
  
  @JSImport("gatsby-core-utils/dist/create-content-digest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContentDigest(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createContentDigest(input: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createContentDigest(input: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
