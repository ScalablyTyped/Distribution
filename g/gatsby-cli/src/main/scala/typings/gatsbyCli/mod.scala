package typings.gatsbyCli

import typings.gatsbyCli.anon.Arguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-cli/lib/create-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCli(argv: js.Array[String]): Arguments = ^.asInstanceOf[js.Dynamic].applyDynamic("createCli")(argv.asInstanceOf[js.Any]).asInstanceOf[Arguments]
}
