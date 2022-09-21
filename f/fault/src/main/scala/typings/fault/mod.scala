package typings.fault

import org.scalablytyped.runtime.Instantiable1
import typings.fault.anon.Call
import typings.fault.anon.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[Fault /* <: js.Error */, Class /* <: Instantiable1[/* reason */ String, Fault] */](Constructor: Class): Call[Fault] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(Constructor.asInstanceOf[js.Any]).asInstanceOf[Call[Fault]]
  
  object fault {
    
    inline def apply(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].apply(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def apply(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].apply(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def apply(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].apply(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    
    @JSImport("fault", "fault")
    @js.native
    val ^ : js.Any = js.native
    
    /** @type {string} */
    @JSImport("fault", "fault.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fault", "fault.eval")
    @js.native
    def eval: DisplayName = js.native
    inline def eval(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def eval(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def eval(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def eval_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eval")(x.asInstanceOf[js.Any])
    
    @JSImport("fault", "fault.range")
    @js.native
    def range: DisplayName = js.native
    inline def range(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def range(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def range(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def range_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("fault", "fault.reference")
    @js.native
    def reference: DisplayName = js.native
    inline def reference(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def reference(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def reference(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def reference_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    
    @JSImport("fault", "fault.syntax")
    @js.native
    def syntax: DisplayName = js.native
    inline def syntax(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def syntax(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def syntax(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def syntax_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("syntax")(x.asInstanceOf[js.Any])
    
    @JSImport("fault", "fault.type")
    @js.native
    val `type`: DisplayName = js.native
    inline def `type`(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def `type`(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def `type`(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    
    @JSImport("fault", "fault.uri")
    @js.native
    def uri: DisplayName = js.native
    inline def uri(format: String, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def uri(format: Null, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def uri(format: Unit, values: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")(List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
    inline def uri_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
  }
}
