package typings.easyXapiSupertest

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsMod {
  
  @JSImport("dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lookup(
    domain: String,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def lookup(
    domain: String,
    family: Double,
    callback: js.Function3[/* err */ Error, /* address */ String, /* family */ Double, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(domain.asInstanceOf[js.Any], family.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def resolve(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def resolve(
    domain: String,
    rrtype: String,
    callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(domain.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolve4(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolve6(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolveCname(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolveMx(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolveNs(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolveSrv(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def resolveTxt(domain: String, callback: js.Function2[/* err */ Error, /* addresses */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def reverse(ip: String, callback: js.Function2[/* err */ Error, /* domains */ js.Array[String], Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
