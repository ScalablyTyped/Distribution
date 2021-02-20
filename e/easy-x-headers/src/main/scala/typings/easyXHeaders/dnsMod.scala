package typings.easyXHeaders

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsMod {
  
  @JSImport("dns", "lookup")
  @js.native
  def lookup(
    domain: String,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = js.native
  @JSImport("dns", "lookup")
  @js.native
  def lookup(
    domain: String,
    family: Double,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = js.native
  
  @JSImport("dns", "resolve")
  @js.native
  def resolve(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  @JSImport("dns", "resolve")
  @js.native
  def resolve(
    domain: String,
    rrtype: String,
    callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]
  ): js.Array[String] = js.native
  
  @JSImport("dns", "resolve4")
  @js.native
  def resolve4(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolve6")
  @js.native
  def resolve6(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolveCname")
  @js.native
  def resolveCname(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolveMx")
  @js.native
  def resolveMx(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolveNs")
  @js.native
  def resolveNs(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolveSrv")
  @js.native
  def resolveSrv(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "resolveTxt")
  @js.native
  def resolveTxt(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  
  @JSImport("dns", "reverse")
  @js.native
  def reverse(ip: String, callback: js.Function2[/* err */ Error, /* domains */ js.Array[String], Unit]): js.Array[String] = js.native
}
