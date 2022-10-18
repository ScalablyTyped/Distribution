package typings.devexpressUtils

import typings.devexpressUtils.libFormattersOptionsMod.INumberFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersNumberMod {
  
  @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
  @js.native
  open class NumberFormatter protected () extends StObject {
    def this(options: INumberFormatterOptions) = this()
    
    /* private */ var appendDigits: Any = js.native
    
    /* private */ var appendGroupedInteger: Any = js.native
    
    /* private */ var createCustomFormatLists: Any = js.native
    
    /* private */ var custom: Any = js.native
    
    /* private */ var digits: Any = js.native
    
    /* private */ var fillDigitInfo: Any = js.native
    
    /* private */ var fillFormatInfo: Any = js.native
    
    def format(format: String, value: Double): String = js.native
    
    /* private */ var formatCurrency: Any = js.native
    
    /* private */ var formatCustom: Any = js.native
    
    /* private */ var formatCustomCore: Any = js.native
    
    /* private */ var formatDecimal: Any = js.native
    
    /* private */ var formatExp: Any = js.native
    
    /* private */ var formatExpCore: Any = js.native
    
    /* private */ var formatFixed: Any = js.native
    
    /* private */ var formatGeneral: Any = js.native
    
    /* private */ var formatHex: Any = js.native
    
    /* private */ var formatNumber: Any = js.native
    
    /* private */ var formatPercent: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var pointPos: Any = js.native
    
    /* private */ var positive: Any = js.native
    
    /* private */ var prec: Any = js.native
    
    /* private */ var round: Any = js.native
    
    /* private */ var selectCustomFormatSection: Any = js.native
    
    /* private */ var spec: Any = js.native
    
    /* private */ var upper: Any = js.native
  }
  /* static members */
  object NumberFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.createCustomFormatInfo")
    @js.native
    def createCustomFormatInfo: Any = js.native
    inline def createCustomFormatInfo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCustomFormatInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.getCustomFormatSections")
    @js.native
    def getCustomFormatSections: Any = js.native
    inline def getCustomFormatSections_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCustomFormatSections")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.parseCustomFormatSection")
    @js.native
    def parseCustomFormatSection: Any = js.native
    inline def parseCustomFormatSection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseCustomFormatSection")(x.asInstanceOf[js.Any])
  }
}
