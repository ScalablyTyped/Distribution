package typings.esModuleLexer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es-module-lexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("es-module-lexer", "init")
  @js.native
  val init: js.Promise[Unit] = js.native
  
  inline def parse(source: String): js.Tuple3[
    /* imports */ js.Array[ImportSpecifier], 
    /* exports */ js.Array[ExportSpecifier], 
    /* facade */ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    /* imports */ js.Array[ImportSpecifier], 
    /* exports */ js.Array[ExportSpecifier], 
    /* facade */ Boolean
  ]]
  inline def parse(source: String, name: String): js.Tuple3[
    /* imports */ js.Array[ImportSpecifier], 
    /* exports */ js.Array[ExportSpecifier], 
    /* facade */ Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* imports */ js.Array[ImportSpecifier], 
    /* exports */ js.Array[ExportSpecifier], 
    /* facade */ Boolean
  ]]
  
  trait ExportSpecifier extends StObject {
    
    /**
      * End of exported name
      */
    val e: Double
    
    /**
      * End of local name, or -1.
      */
    val le: Double
    
    /**
      * Local name, or undefined.
      *
      * @example
      * const source = `export default []`;
      * const [imports, exports] = parse(source);
      * exports[0].ln;
      * // Returns undefined
      *
      * @example
      * const asdf = 42;
      * const source = `export { asdf as a }`;
      * const [imports, exports] = parse(source);
      * exports[0].ln;
      * // Returns "asdf"
      */
    val ln: js.UndefOr[String] = js.undefined
    
    /**
      * Start of local name, or -1.
      *
      * @example
      * const asdf = 42;
      * const source = `export { asdf as a }`;
      * const [imports, exports] = parse(source);
      * source.substring(exports[0].ls, exports[0].le);
      * // Returns "asdf"
      */
    val ls: Double
    
    /**
      * Exported name
      *
      * @example
      * const source = `export default []`;
      * const [imports, exports] = parse(source);
      * exports[0].n;
      * // Returns "default"
      *
      * @example
      * const source = `export const asdf = 42`;
      * const [imports, exports] = parse(source);
      * exports[0].n;
      * // Returns "asdf"
      */
    val n: String
    
    /**
      * Start of exported name
      *
      * @example
      * const source = `export default []`;
      * const [imports, exports] = parse(source);
      * source.substring(exports[0].s, exports[0].e);
      * // Returns "default"
      *
      * @example
      * const source = `export { 42 as asdf }`;
      * const [imports, exports] = parse(source);
      * source.substring(exports[0].s, exports[0].e);
      * // Returns "asdf"
      */
    val s: Double
  }
  object ExportSpecifier {
    
    inline def apply(e: Double, le: Double, ls: Double, n: String, s: Double): ExportSpecifier = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], le = le.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportSpecifier]
    }
    
    extension [Self <: ExportSpecifier](x: Self) {
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setLe(value: Double): Self = StObject.set(x, "le", value.asInstanceOf[js.Any])
      
      inline def setLn(value: String): Self = StObject.set(x, "ln", value.asInstanceOf[js.Any])
      
      inline def setLnUndefined: Self = StObject.set(x, "ln", js.undefined)
      
      inline def setLs(value: Double): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportSpecifier extends StObject {
    
    /**
      * If this import has an import assertion, this is the start value.
      * Otherwise this is `-1`.
      */
    val a: Double
    
    /**
      * If this import statement is a dynamic import, this is the start value.
      * Otherwise this is `-1`.
      */
    val d: Double
    
    /**
      * End of module specifier
      */
    val e: Double
    
    /**
      * Module name
      *
      * To handle escape sequences in specifier strings, the .n field of imported specifiers will be provided where possible.
      *
      * For dynamic import expressions, this field will be empty if not a valid JS string.
      *
      * @example
      * const [imports1, exports1] = parse(String.raw`import './\\u0061\\u0062.js'`);
      * imports1[0].n;
      * // Returns "./ab.js"
      *
      * const [imports2, exports2] = parse(`import("./ab.js")`);
      * imports2[0].n;
      * // Returns "./ab.js"
      *
      * const [imports3, exports3] = parse(`import("./" + "ab.js")`);
      * imports3[0].n;
      * // Returns undefined
      */
    val n: js.UndefOr[String] = js.undefined
    
    /**
      * Start of module specifier
      *
      * @example
      * const source = `import { a } from 'asdf'`;
      * const [imports, exports] = parse(source);
      * source.substring(imports[0].s, imports[0].e);
      * // Returns "asdf"
      */
    val s: Double
    
    /**
      * End of import statement
      */
    val se: Double
    
    /**
      * Start of import statement
      *
      * @example
      * const source = `import { a } from 'asdf'`;
      * const [imports, exports] = parse(source);
      * source.substring(imports[0].ss, imports[0].se);
      * // Returns "import { a } from 'asdf';"
      */
    val ss: Double
  }
  object ImportSpecifier {
    
    inline def apply(a: Double, d: Double, e: Double, s: Double, se: Double, ss: Double): ImportSpecifier = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportSpecifier]
    }
    
    extension [Self <: ImportSpecifier](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSe(value: Double): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      inline def setSs(value: Double): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
}
