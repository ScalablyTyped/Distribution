package typings.easyXHeaders

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", JSImport.Namespace)
@js.native
object dnsMod extends js.Object {
  def lookup(
    domain: String,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = js.native
  def lookup(
    domain: String,
    family: Double,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = js.native
  def resolve(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolve(
    domain: String,
    rrtype: String,
    callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]
  ): js.Array[String] = js.native
  def resolve4(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolve6(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolveCname(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolveMx(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolveNs(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolveSrv(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def resolveTxt(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = js.native
  def reverse(ip: String, callback: js.Function2[/* err */ Error, /* domains */ js.Array[String], Unit]): js.Array[String] = js.native
}

