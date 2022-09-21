package typings.egjsAgent

import typings.egjsAgent.typesMod.AgentInfo
import typings.egjsAgent.typesMod.UADataValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentDataMod {
  
  @JSImport("@egjs/agent/declaration/userAgentData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClientHintsAgent(): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientHintsAgent")().asInstanceOf[AgentInfo]
  inline def getClientHintsAgent(osData: UADataValues): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientHintsAgent")(osData.asInstanceOf[js.Any]).asInstanceOf[AgentInfo]
}
