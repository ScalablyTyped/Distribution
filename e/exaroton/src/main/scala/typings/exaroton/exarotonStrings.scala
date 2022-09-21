package typings.exaroton

import typings.exaroton.mod.ConsoleDataType
import typings.exaroton.mod.HeapDataType
import typings.exaroton.mod.Message
import typings.exaroton.mod.Method
import typings.exaroton.mod.PlayerListTypes
import typings.exaroton.mod.StatsDataType
import typings.exaroton.mod.SubscriptionType
import typings.exaroton.mod.TickDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exarotonStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with Method
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with Method
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Slashv1 extends StObject
  inline def Slashv1: Slashv1 = "/v1".asInstanceOf[Slashv1]
  
  @js.native
  sealed trait apiDotexarotonDotcom extends StObject
  inline def apiDotexarotonDotcom: apiDotexarotonDotcom = "api.exaroton.com".asInstanceOf[apiDotexarotonDotcom]
  
  @js.native
  sealed trait `banned-ips`
    extends StObject
       with PlayerListTypes
  inline def `banned-ips`: `banned-ips` = "banned-ips".asInstanceOf[`banned-ips`]
  
  @js.native
  sealed trait `banned-players`
    extends StObject
       with PlayerListTypes
  inline def `banned-players`: `banned-players` = "banned-players".asInstanceOf[`banned-players`]
  
  @js.native
  sealed trait command
    extends StObject
       with ConsoleDataType
  inline def command: command = "command".asInstanceOf[command]
  
  @js.native
  sealed trait console
    extends StObject
       with SubscriptionType
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait heap
    extends StObject
       with HeapDataType
       with SubscriptionType
  inline def heap: heap = "heap".asInstanceOf[heap]
  
  @js.native
  sealed trait https extends StObject
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait line
    extends StObject
       with ConsoleDataType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait ops
    extends StObject
       with PlayerListTypes
  inline def ops: ops = "ops".asInstanceOf[ops]
  
  @js.native
  sealed trait start
    extends StObject
       with ConsoleDataType
       with HeapDataType
       with StatsDataType
       with TickDataType
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait started
    extends StObject
       with ConsoleDataType
       with HeapDataType
       with Message
       with StatsDataType
       with TickDataType
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stats
    extends StObject
       with StatsDataType
       with SubscriptionType
  inline def stats: stats = "stats".asInstanceOf[stats]
  
  @js.native
  sealed trait stop
    extends StObject
       with ConsoleDataType
       with HeapDataType
       with StatsDataType
       with TickDataType
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stopped
    extends StObject
       with Message
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait tick
    extends StObject
       with SubscriptionType
       with TickDataType
  inline def tick: tick = "tick".asInstanceOf[tick]
  
  @js.native
  sealed trait whitelist
    extends StObject
       with PlayerListTypes
  inline def whitelist: whitelist = "whitelist".asInstanceOf[whitelist]
  
  @js.native
  sealed trait ws extends StObject
  inline def ws: ws = "ws".asInstanceOf[ws]
  
  @js.native
  sealed trait wss extends StObject
  inline def wss: wss = "wss".asInstanceOf[wss]
}
