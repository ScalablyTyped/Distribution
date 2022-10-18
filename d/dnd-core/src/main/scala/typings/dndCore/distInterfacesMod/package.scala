package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionCreator[Payload] = js.Function1[/* args */ js.Array[Any], Action[Payload]]

type BackendFactory = js.Function3[
/* manager */ DragDropManager, 
/* globalContext */ js.UndefOr[Any], 
/* configuration */ js.UndefOr[Any], 
Backend]

type Identifier = String | js.Symbol

type Listener = js.Function0[Unit]

type SourceType = Identifier

type TargetType = Identifier | js.Array[Identifier]

type Unsubscribe = js.Function0[Unit]
