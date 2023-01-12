package typings.flatpickr

import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesOptionsMod.ParsedOptions
import typings.flatpickr.flatpickrStrings.d_
import typings.flatpickr.flatpickrStrings.h_
import typings.flatpickr.flatpickrStrings.j_
import typings.flatpickr.flatpickrStrings.m_
import typings.flatpickr.flatpickrStrings.s_
import typings.flatpickr.flatpickrStrings.u_
import typings.flatpickr.flatpickrStrings.w_
import typings.flatpickr.flatpickrStrings.y_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFormattingMod {
  
  @JSImport("flatpickr/dist/utils/formatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("flatpickr/dist/utils/formatting", "formats")
  @js.native
  val formats: Formats_ = js.native
  
  inline def monthToStr(monthNumber: Double, shorthand: Boolean, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthToStr")(monthNumber.asInstanceOf[js.Any], shorthand.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("flatpickr/dist/utils/formatting", "revFormat")
  @js.native
  val revFormat: RevFormat_ = js.native
  
  @JSImport("flatpickr/dist/utils/formatting", "tokenRegex")
  @js.native
  val tokenRegex: TokenRegex_ = js.native
  
  /* Inlined std.Record<flatpickr.flatpickr/dist/utils/formatting.token, (date : flatpickr.flatpickr/dist/types/globals.<global>.Date, locale : flatpickr.flatpickr/dist/types/locale.Locale, options : flatpickr.flatpickr/dist/types/options.ParsedOptions): string | number> */
  trait Formats_ extends StObject {
    
    def D(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("D")
    var D_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def F(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("F")
    var F_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def G(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("G")
    var G_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def H(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("H")
    var H_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def J(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("J")
    var J_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def K(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("K")
    var K_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def M(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("M")
    var M_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def S(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("S")
    var S_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def U(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("U")
    var U_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def W(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("W")
    var W_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def Y(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("Y")
    var Y_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def Z(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("Z")
    var Z_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def d(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("d")
    var d_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def h(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("h")
    var h_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def i(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("i")
    var i_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def j(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("j")
    var j_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def l(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("l")
    var l_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def m(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("m")
    var m_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def n(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("n")
    var n_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def s(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("s")
    var s_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def u(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("u")
    var u_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def w(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("w")
    var w_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
    
    def y(date: Date, locale: Locale, options: ParsedOptions): String | Double
    @JSName("y")
    var y_Original: js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
  }
  object Formats_ {
    
    inline def apply(
      D: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      F: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      G: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      H: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      J: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      K: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      M: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      S: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      U: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      W: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      Y: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      Z: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      d: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      h: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      i: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      j: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      l: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      m: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      n: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      s: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      u: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      w: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double,
      y: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double
    ): Formats_ = {
      val __obj = js.Dynamic.literal(D = js.Any.fromFunction3(D), F = js.Any.fromFunction3(F), G = js.Any.fromFunction3(G), H = js.Any.fromFunction3(H), J = js.Any.fromFunction3(J), K = js.Any.fromFunction3(K), M = js.Any.fromFunction3(M), S = js.Any.fromFunction3(S), U = js.Any.fromFunction3(U), W = js.Any.fromFunction3(W), Y = js.Any.fromFunction3(Y), Z = js.Any.fromFunction3(Z), d = js.Any.fromFunction3(d), h = js.Any.fromFunction3(h), i = js.Any.fromFunction3(i), j = js.Any.fromFunction3(j), l = js.Any.fromFunction3(l), m = js.Any.fromFunction3(m), n = js.Any.fromFunction3(n), s = js.Any.fromFunction3(s), u = js.Any.fromFunction3(u), w = js.Any.fromFunction3(w), y = js.Any.fromFunction3(y))
      __obj.asInstanceOf[Formats_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formats_] (val x: Self) extends AnyVal {
      
      inline def setD(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "D", js.Any.fromFunction3(value))
      
      inline def setF(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "F", js.Any.fromFunction3(value))
      
      inline def setG(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "G", js.Any.fromFunction3(value))
      
      inline def setH(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "H", js.Any.fromFunction3(value))
      
      inline def setI(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "i", js.Any.fromFunction3(value))
      
      inline def setJ(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "J", js.Any.fromFunction3(value))
      
      inline def setK(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "K", js.Any.fromFunction3(value))
      
      inline def setL(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "l", js.Any.fromFunction3(value))
      
      inline def setM(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "M", js.Any.fromFunction3(value))
      
      inline def setN(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "n", js.Any.fromFunction3(value))
      
      inline def setS(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "S", js.Any.fromFunction3(value))
      
      inline def setU(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "U", js.Any.fromFunction3(value))
      
      inline def setW(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "W", js.Any.fromFunction3(value))
      
      inline def setY(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "Y", js.Any.fromFunction3(value))
      
      inline def setZ(value: (/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions) => String | Double): Self = StObject.set(x, "Z", js.Any.fromFunction3(value))
    }
  }
  
  type RevFormatFn = js.Function3[/* date */ Date, /* data */ String, /* locale */ Locale, js.UndefOr[Date | Unit]]
  
  type RevFormat_ = Record[String, RevFormatFn]
  
  /* Inlined {[ k in flatpickr.flatpickr/dist/utils/formatting.token ]: string} */
  trait TokenRegex_ extends StObject {
    
    var D: String
    
    var F: String
    
    var G: String
    
    var H: String
    
    var J: String
    
    var K: String
    
    var M: String
    
    var S: String
    
    var U: String
    
    var W: String
    
    var Y: String
    
    var Z: String
    
    var d: String
    
    var h: String
    
    var i: String
    
    var j: String
    
    var l: String
    
    var m: String
    
    var n: String
    
    var s: String
    
    var u: String
    
    var w: String
    
    var y: String
  }
  object TokenRegex_ {
    
    inline def apply(
      D: String,
      F: String,
      G: String,
      H: String,
      J: String,
      K: String,
      M: String,
      S: String,
      U: String,
      W: String,
      Y: String,
      Z: String,
      d: String,
      h: String,
      i: String,
      j: String,
      l: String,
      m: String,
      n: String,
      s: String,
      u: String,
      w: String,
      y: String
    ): TokenRegex_ = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], J = J.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRegex_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenRegex_] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      inline def setG(value: String): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      inline def setH(value: String): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setJ(value: String): Self = StObject.set(x, "J", value.asInstanceOf[js.Any])
      
      inline def setK(value: String): Self = StObject.set(x, "K", value.asInstanceOf[js.Any])
      
      inline def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setU(value: String): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
      
      inline def setW(value: String): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: String): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.flatpickr.flatpickrStrings.D
    - typings.flatpickr.flatpickrStrings.F
    - typings.flatpickr.flatpickrStrings.G
    - typings.flatpickr.flatpickrStrings.H
    - typings.flatpickr.flatpickrStrings.J
    - typings.flatpickr.flatpickrStrings.K
    - typings.flatpickr.flatpickrStrings.M
    - typings.flatpickr.flatpickrStrings.S
    - typings.flatpickr.flatpickrStrings.U
    - typings.flatpickr.flatpickrStrings.W
    - typings.flatpickr.flatpickrStrings.Y
    - typings.flatpickr.flatpickrStrings.Z
    - typings.flatpickr.flatpickrStrings.d_
    - typings.flatpickr.flatpickrStrings.h_
    - typings.flatpickr.flatpickrStrings.i
    - typings.flatpickr.flatpickrStrings.j_
    - typings.flatpickr.flatpickrStrings.l
    - typings.flatpickr.flatpickrStrings.m_
    - typings.flatpickr.flatpickrStrings.n
    - typings.flatpickr.flatpickrStrings.s_
    - typings.flatpickr.flatpickrStrings.u_
    - typings.flatpickr.flatpickrStrings.w_
    - typings.flatpickr.flatpickrStrings.y_
  */
  trait token extends StObject
  object token {
    
    inline def D: typings.flatpickr.flatpickrStrings.D = "D".asInstanceOf[typings.flatpickr.flatpickrStrings.D]
    
    inline def F: typings.flatpickr.flatpickrStrings.F = "F".asInstanceOf[typings.flatpickr.flatpickrStrings.F]
    
    inline def G: typings.flatpickr.flatpickrStrings.G = "G".asInstanceOf[typings.flatpickr.flatpickrStrings.G]
    
    inline def H: typings.flatpickr.flatpickrStrings.H = "H".asInstanceOf[typings.flatpickr.flatpickrStrings.H]
    
    inline def J: typings.flatpickr.flatpickrStrings.J = "J".asInstanceOf[typings.flatpickr.flatpickrStrings.J]
    
    inline def K: typings.flatpickr.flatpickrStrings.K = "K".asInstanceOf[typings.flatpickr.flatpickrStrings.K]
    
    inline def M: typings.flatpickr.flatpickrStrings.M = "M".asInstanceOf[typings.flatpickr.flatpickrStrings.M]
    
    inline def S: typings.flatpickr.flatpickrStrings.S = "S".asInstanceOf[typings.flatpickr.flatpickrStrings.S]
    
    inline def U: typings.flatpickr.flatpickrStrings.U = "U".asInstanceOf[typings.flatpickr.flatpickrStrings.U]
    
    inline def W: typings.flatpickr.flatpickrStrings.W = "W".asInstanceOf[typings.flatpickr.flatpickrStrings.W]
    
    inline def Y: typings.flatpickr.flatpickrStrings.Y = "Y".asInstanceOf[typings.flatpickr.flatpickrStrings.Y]
    
    inline def Z: typings.flatpickr.flatpickrStrings.Z = "Z".asInstanceOf[typings.flatpickr.flatpickrStrings.Z]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def h: h_ = "h".asInstanceOf[h_]
    
    inline def i: typings.flatpickr.flatpickrStrings.i = "i".asInstanceOf[typings.flatpickr.flatpickrStrings.i]
    
    inline def j: j_ = "j".asInstanceOf[j_]
    
    inline def l: typings.flatpickr.flatpickrStrings.l = "l".asInstanceOf[typings.flatpickr.flatpickrStrings.l]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def n: typings.flatpickr.flatpickrStrings.n = "n".asInstanceOf[typings.flatpickr.flatpickrStrings.n]
    
    inline def s: s_ = "s".asInstanceOf[s_]
    
    inline def u: u_ = "u".asInstanceOf[u_]
    
    inline def w: w_ = "w".asInstanceOf[w_]
    
    inline def y: y_ = "y".asInstanceOf[y_]
  }
}
