package typings.dndCore

import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractsMod {
  
  @JSImport("dnd-core/dist/contracts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSourceContract(source: DragSource): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSourceContract")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTargetContract(target: DropTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTargetContract")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateType(`type`: js.Array[Identifier]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateType(`type`: js.Array[Identifier], allowArray: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateType")(`type`.asInstanceOf[js.Any], allowArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateType(`type`: Identifier): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateType(`type`: Identifier, allowArray: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateType")(`type`.asInstanceOf[js.Any], allowArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
