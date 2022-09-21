package typings.fsJetpack.typesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppendData = String | Buffer

type OverwriteFunction = js.Function2[
/* srcInspectData */ InspectResult, 
/* destInspectData */ InspectResult, 
Boolean | js.Promise[Boolean]]

type WritableData = String | js.Object | js.Array[Any] | Buffer
