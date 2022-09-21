package typings.exaroton.mod

import typings.exaroton.anon.Tail
import typings.std.RegExpConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleStream extends Stream {
  
  /* private */ def ansiRegex(pattern: String): js.RegExp = js.native
  /* private */ def ansiRegex(pattern: String, flags: String): js.RegExp = js.native
  /* standard es2015.core */
  /* private */ def ansiRegex(pattern: js.RegExp): js.RegExp = js.native
  /* private */ def ansiRegex(pattern: js.RegExp, flags: String): js.RegExp = js.native
  /* private */ @JSName("ansiRegex")
  var ansiRegex_Original: RegExpConstructor = js.native
  
  def onDataMessage(`type`: ConsoleDataType, message: String): Unit = js.native
  
  def parseLine(line: String): String = js.native
  
  def parseReturns(string: String): String = js.native
  
  def sendCommand(command: String): Unit = js.native
  
  @JSName("startData")
  var startData_ConsoleStream: Tail = js.native
}
