package typings.egjsAgent

import typings.egjsAgent.declarationTypesMod.AgentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationUserAgentMod {
  
  @JSImport("@egjs/agent/declaration/userAgent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLegacyAgent(): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyAgent")().asInstanceOf[AgentInfo]
  inline def getLegacyAgent(userAgent: String): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyAgent")(userAgent.asInstanceOf[js.Any]).asInstanceOf[AgentInfo]
  
  inline def isWebView(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
