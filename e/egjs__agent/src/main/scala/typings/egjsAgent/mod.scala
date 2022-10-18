package typings.egjsAgent

import typings.egjsAgent.declarationTypesMod.AgentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[AgentInfo]
  inline def default(userAgent: String): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userAgent.asInstanceOf[js.Any]).asInstanceOf[AgentInfo]
  
  inline def getAccurateAgent(): js.Promise[AgentInfo] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccurateAgent")().asInstanceOf[js.Promise[AgentInfo] | Null]
  inline def getAccurateAgent(callback: js.Function1[/* result */ AgentInfo, Unit]): js.Promise[AgentInfo] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccurateAgent")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AgentInfo] | Null]
  
  inline def getLegacyAgent(): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyAgent")().asInstanceOf[AgentInfo]
  inline def getLegacyAgent(userAgent: String): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyAgent")(userAgent.asInstanceOf[js.Any]).asInstanceOf[AgentInfo]
}
