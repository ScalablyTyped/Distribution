package typings.framebus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FramebusOnHandler = js.Function2[
    /* data */ typings.framebus.typesMod.FramebusSubscriberArg, 
    /* reply */ typings.framebus.typesMod.FramebusReplyHandler, 
    scala.Unit
  ]
  
  type FramebusReplyHandler = js.Function1[/* data */ js.Any, scala.Unit]
  
  type FramebusSubscribeHandler = js.Function2[
    /* data */ js.UndefOr[
      typings.framebus.typesMod.FramebusSubscriberArg | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object)
    ], 
    /* reply */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object
    ], 
    scala.Unit
  ]
  
  type FramebusSubscriber = typings.std.Record[java.lang.String, typings.framebus.typesMod.FramebusSubscription]
  
  type FramebusSubscriberArg = typings.std.Record[java.lang.String, js.Any]
  
  type FramebusSubscription = typings.std.Record[java.lang.String, js.Array[typings.framebus.typesMod.FramebusSubscribeHandler]]
  
  type ReplyFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
}
