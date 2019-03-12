package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", JSImport.Namespace)
@js.native
object dnsMod extends js.Object {
  def lookup(
    domain: java.lang.String,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def lookup(
    domain: java.lang.String,
    family: scala.Double,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def resolve(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolve(
    domain: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolve4(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolve6(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolveCname(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolveMx(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolveNs(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolveSrv(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def resolveTxt(
    domain: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addresses */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* domains */ js.Array[java.lang.String], scala.Unit]
  ): js.Array[java.lang.String] = js.native
}

