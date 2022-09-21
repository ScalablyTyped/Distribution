package typings.dineroJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Dinero = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Dinero]
  inline def apply(options: Options): Dinero = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  @JSImport("dinero.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dinero.js", "defaultAmount")
  @js.native
  def defaultAmount: Double = js.native
  inline def defaultAmount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAmount")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "defaultCurrency")
  @js.native
  def defaultCurrency: Currency = js.native
  inline def defaultCurrency_=(x: Currency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrency")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "defaultPrecision")
  @js.native
  def defaultPrecision: Double = js.native
  inline def defaultPrecision_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPrecision")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalExchangeRatesApi")
  @js.native
  def globalExchangeRatesApi: ExchangeRatesApiOptions = js.native
  inline def globalExchangeRatesApi_=(x: ExchangeRatesApiOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalExchangeRatesApi")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalFormat")
  @js.native
  def globalFormat: String = js.native
  
  @JSImport("dinero.js", "globalFormatRoundingMode")
  @js.native
  def globalFormatRoundingMode: String = js.native
  inline def globalFormatRoundingMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalFormatRoundingMode")(x.asInstanceOf[js.Any])
  
  inline def globalFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalLocale")
  @js.native
  def globalLocale: String = js.native
  inline def globalLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalRoundingMode")
  @js.native
  def globalRoundingMode: RoundingMode = js.native
  inline def globalRoundingMode_=(x: RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalRoundingMode")(x.asInstanceOf[js.Any])
  
  inline def maximum(objects: js.Array[Dinero]): Dinero = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(objects.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  inline def minimum(objects: js.Array[Dinero]): Dinero = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(objects.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  inline def normalizePrecision(objects: js.Array[Dinero]): js.Array[Dinero] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePrecision")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[Dinero]]
  
  /**
    * ISO 4217 CURRENCY CODES as specified in the documentation
    * Taken from https://www.iso.org/iso-4217-currency-codes.html
    * sorted and parsed
    */
  /* Rewritten from type alias, can be one of: 
    - typings.dineroJs.dineroJsStrings.AED
    - typings.dineroJs.dineroJsStrings.AFN
    - typings.dineroJs.dineroJsStrings.ALL
    - typings.dineroJs.dineroJsStrings.AMD
    - typings.dineroJs.dineroJsStrings.ANG
    - typings.dineroJs.dineroJsStrings.AOA
    - typings.dineroJs.dineroJsStrings.ARS
    - typings.dineroJs.dineroJsStrings.AUD
    - typings.dineroJs.dineroJsStrings.AWG
    - typings.dineroJs.dineroJsStrings.AZN
    - typings.dineroJs.dineroJsStrings.BAM
    - typings.dineroJs.dineroJsStrings.BBD
    - typings.dineroJs.dineroJsStrings.BDT
    - typings.dineroJs.dineroJsStrings.BGN
    - typings.dineroJs.dineroJsStrings.BHD
    - typings.dineroJs.dineroJsStrings.BIF
    - typings.dineroJs.dineroJsStrings.BMD
    - typings.dineroJs.dineroJsStrings.BND
    - typings.dineroJs.dineroJsStrings.BOB
    - typings.dineroJs.dineroJsStrings.BOV
    - typings.dineroJs.dineroJsStrings.BRL
    - typings.dineroJs.dineroJsStrings.BSD
    - typings.dineroJs.dineroJsStrings.BTN
    - typings.dineroJs.dineroJsStrings.BWP
    - typings.dineroJs.dineroJsStrings.BYN
    - typings.dineroJs.dineroJsStrings.BZD
    - typings.dineroJs.dineroJsStrings.CAD
    - typings.dineroJs.dineroJsStrings.CDF
    - typings.dineroJs.dineroJsStrings.CHE
    - typings.dineroJs.dineroJsStrings.CHF
    - typings.dineroJs.dineroJsStrings.CHW
    - typings.dineroJs.dineroJsStrings.CLF
    - typings.dineroJs.dineroJsStrings.CLP
    - typings.dineroJs.dineroJsStrings.CNY
    - typings.dineroJs.dineroJsStrings.COP
    - typings.dineroJs.dineroJsStrings.COU
    - typings.dineroJs.dineroJsStrings.CRC
    - typings.dineroJs.dineroJsStrings.CUC
    - typings.dineroJs.dineroJsStrings.CUP
    - typings.dineroJs.dineroJsStrings.CVE
    - typings.dineroJs.dineroJsStrings.CZK
    - typings.dineroJs.dineroJsStrings.DJF
    - typings.dineroJs.dineroJsStrings.DKK
    - typings.dineroJs.dineroJsStrings.DOP
    - typings.dineroJs.dineroJsStrings.DZD
    - typings.dineroJs.dineroJsStrings.EGP
    - typings.dineroJs.dineroJsStrings.ERN
    - typings.dineroJs.dineroJsStrings.ETB
    - typings.dineroJs.dineroJsStrings.EUR
    - typings.dineroJs.dineroJsStrings.FJD
    - typings.dineroJs.dineroJsStrings.FKP
    - typings.dineroJs.dineroJsStrings.GBP
    - typings.dineroJs.dineroJsStrings.GEL
    - typings.dineroJs.dineroJsStrings.GHS
    - typings.dineroJs.dineroJsStrings.GIP
    - typings.dineroJs.dineroJsStrings.GMD
    - typings.dineroJs.dineroJsStrings.GNF
    - typings.dineroJs.dineroJsStrings.GTQ
    - typings.dineroJs.dineroJsStrings.GYD
    - typings.dineroJs.dineroJsStrings.HKD
    - typings.dineroJs.dineroJsStrings.HNL
    - typings.dineroJs.dineroJsStrings.HRK
    - typings.dineroJs.dineroJsStrings.HTG
    - typings.dineroJs.dineroJsStrings.HUF
    - typings.dineroJs.dineroJsStrings.IDR
    - typings.dineroJs.dineroJsStrings.ILS
    - typings.dineroJs.dineroJsStrings.INR
    - typings.dineroJs.dineroJsStrings.IQD
    - typings.dineroJs.dineroJsStrings.IRR
    - typings.dineroJs.dineroJsStrings.ISK
    - typings.dineroJs.dineroJsStrings.JMD
    - typings.dineroJs.dineroJsStrings.JOD
    - typings.dineroJs.dineroJsStrings.JPY
    - typings.dineroJs.dineroJsStrings.KES
    - typings.dineroJs.dineroJsStrings.KGS
    - typings.dineroJs.dineroJsStrings.KHR
    - typings.dineroJs.dineroJsStrings.KMF
    - typings.dineroJs.dineroJsStrings.KPW
    - typings.dineroJs.dineroJsStrings.KRW
    - typings.dineroJs.dineroJsStrings.KWD
    - typings.dineroJs.dineroJsStrings.KYD
    - typings.dineroJs.dineroJsStrings.KZT
    - typings.dineroJs.dineroJsStrings.LAK
    - typings.dineroJs.dineroJsStrings.LBP
    - typings.dineroJs.dineroJsStrings.LKR
    - typings.dineroJs.dineroJsStrings.LRD
    - typings.dineroJs.dineroJsStrings.LSL
    - typings.dineroJs.dineroJsStrings.LYD
    - typings.dineroJs.dineroJsStrings.MAD
    - typings.dineroJs.dineroJsStrings.MDL
    - typings.dineroJs.dineroJsStrings.MGA
    - typings.dineroJs.dineroJsStrings.MKD
    - typings.dineroJs.dineroJsStrings.MMK
    - typings.dineroJs.dineroJsStrings.MNT
    - typings.dineroJs.dineroJsStrings.MOP
    - typings.dineroJs.dineroJsStrings.MRU
    - typings.dineroJs.dineroJsStrings.MUR
    - typings.dineroJs.dineroJsStrings.MVR
    - typings.dineroJs.dineroJsStrings.MWK
    - typings.dineroJs.dineroJsStrings.MXN
    - typings.dineroJs.dineroJsStrings.MXV
    - typings.dineroJs.dineroJsStrings.MYR
    - typings.dineroJs.dineroJsStrings.MZN
    - typings.dineroJs.dineroJsStrings.NAD
    - typings.dineroJs.dineroJsStrings.NGN
    - typings.dineroJs.dineroJsStrings.NIO
    - typings.dineroJs.dineroJsStrings.NOK
    - typings.dineroJs.dineroJsStrings.NPR
    - typings.dineroJs.dineroJsStrings.NZD
    - typings.dineroJs.dineroJsStrings.OMR
    - typings.dineroJs.dineroJsStrings.PAB
    - typings.dineroJs.dineroJsStrings.PEN
    - typings.dineroJs.dineroJsStrings.PGK
    - typings.dineroJs.dineroJsStrings.PHP
    - typings.dineroJs.dineroJsStrings.PKR
    - typings.dineroJs.dineroJsStrings.PLN
    - typings.dineroJs.dineroJsStrings.PYG
    - typings.dineroJs.dineroJsStrings.QAR
    - typings.dineroJs.dineroJsStrings.RON
    - typings.dineroJs.dineroJsStrings.RSD
    - typings.dineroJs.dineroJsStrings.RUB
    - typings.dineroJs.dineroJsStrings.RWF
    - typings.dineroJs.dineroJsStrings.SAR
    - typings.dineroJs.dineroJsStrings.SBD
    - typings.dineroJs.dineroJsStrings.SCR
    - typings.dineroJs.dineroJsStrings.SDG
    - typings.dineroJs.dineroJsStrings.SEK
    - typings.dineroJs.dineroJsStrings.SGD
    - typings.dineroJs.dineroJsStrings.SHP
    - typings.dineroJs.dineroJsStrings.SLL
    - typings.dineroJs.dineroJsStrings.SOS
    - typings.dineroJs.dineroJsStrings.SRD
    - typings.dineroJs.dineroJsStrings.SSP
    - typings.dineroJs.dineroJsStrings.STN
    - typings.dineroJs.dineroJsStrings.SVC
    - typings.dineroJs.dineroJsStrings.SYP
    - typings.dineroJs.dineroJsStrings.SZL
    - typings.dineroJs.dineroJsStrings.THB
    - typings.dineroJs.dineroJsStrings.TJS
    - typings.dineroJs.dineroJsStrings.TMT
    - typings.dineroJs.dineroJsStrings.TND
    - typings.dineroJs.dineroJsStrings.TOP
    - typings.dineroJs.dineroJsStrings.TRY
    - typings.dineroJs.dineroJsStrings.TTD
    - typings.dineroJs.dineroJsStrings.TWD
    - typings.dineroJs.dineroJsStrings.TZS
    - typings.dineroJs.dineroJsStrings.UAH
    - typings.dineroJs.dineroJsStrings.UGX
    - typings.dineroJs.dineroJsStrings.USD
    - typings.dineroJs.dineroJsStrings.USN
    - typings.dineroJs.dineroJsStrings.UYI
    - typings.dineroJs.dineroJsStrings.UYU
    - typings.dineroJs.dineroJsStrings.UYW
    - typings.dineroJs.dineroJsStrings.UZS
    - typings.dineroJs.dineroJsStrings.VES
    - typings.dineroJs.dineroJsStrings.VND
    - typings.dineroJs.dineroJsStrings.VUV
    - typings.dineroJs.dineroJsStrings.WST
    - typings.dineroJs.dineroJsStrings.XAF
    - typings.dineroJs.dineroJsStrings.XAG
    - typings.dineroJs.dineroJsStrings.XAU
    - typings.dineroJs.dineroJsStrings.XBA
    - typings.dineroJs.dineroJsStrings.XBB
    - typings.dineroJs.dineroJsStrings.XBC
    - typings.dineroJs.dineroJsStrings.XBD
    - typings.dineroJs.dineroJsStrings.XCD
    - typings.dineroJs.dineroJsStrings.XDR
    - typings.dineroJs.dineroJsStrings.XOF
    - typings.dineroJs.dineroJsStrings.XPD
    - typings.dineroJs.dineroJsStrings.XPF
    - typings.dineroJs.dineroJsStrings.XPT
    - typings.dineroJs.dineroJsStrings.XSU
    - typings.dineroJs.dineroJsStrings.XTS
    - typings.dineroJs.dineroJsStrings.XUA
    - typings.dineroJs.dineroJsStrings.XXX
    - typings.dineroJs.dineroJsStrings.YER
    - typings.dineroJs.dineroJsStrings.ZAR
    - typings.dineroJs.dineroJsStrings.ZMW
    - typings.dineroJs.dineroJsStrings.ZWL
  */
  trait Currency extends StObject
  object Currency {
    
    inline def AED: typings.dineroJs.dineroJsStrings.AED = "AED".asInstanceOf[typings.dineroJs.dineroJsStrings.AED]
    
    inline def AFN: typings.dineroJs.dineroJsStrings.AFN = "AFN".asInstanceOf[typings.dineroJs.dineroJsStrings.AFN]
    
    inline def ALL: typings.dineroJs.dineroJsStrings.ALL = "ALL".asInstanceOf[typings.dineroJs.dineroJsStrings.ALL]
    
    inline def AMD: typings.dineroJs.dineroJsStrings.AMD = "AMD".asInstanceOf[typings.dineroJs.dineroJsStrings.AMD]
    
    inline def ANG: typings.dineroJs.dineroJsStrings.ANG = "ANG".asInstanceOf[typings.dineroJs.dineroJsStrings.ANG]
    
    inline def AOA: typings.dineroJs.dineroJsStrings.AOA = "AOA".asInstanceOf[typings.dineroJs.dineroJsStrings.AOA]
    
    inline def ARS: typings.dineroJs.dineroJsStrings.ARS = "ARS".asInstanceOf[typings.dineroJs.dineroJsStrings.ARS]
    
    inline def AUD: typings.dineroJs.dineroJsStrings.AUD = "AUD".asInstanceOf[typings.dineroJs.dineroJsStrings.AUD]
    
    inline def AWG: typings.dineroJs.dineroJsStrings.AWG = "AWG".asInstanceOf[typings.dineroJs.dineroJsStrings.AWG]
    
    inline def AZN: typings.dineroJs.dineroJsStrings.AZN = "AZN".asInstanceOf[typings.dineroJs.dineroJsStrings.AZN]
    
    inline def BAM: typings.dineroJs.dineroJsStrings.BAM = "BAM".asInstanceOf[typings.dineroJs.dineroJsStrings.BAM]
    
    inline def BBD: typings.dineroJs.dineroJsStrings.BBD = "BBD".asInstanceOf[typings.dineroJs.dineroJsStrings.BBD]
    
    inline def BDT: typings.dineroJs.dineroJsStrings.BDT = "BDT".asInstanceOf[typings.dineroJs.dineroJsStrings.BDT]
    
    inline def BGN: typings.dineroJs.dineroJsStrings.BGN = "BGN".asInstanceOf[typings.dineroJs.dineroJsStrings.BGN]
    
    inline def BHD: typings.dineroJs.dineroJsStrings.BHD = "BHD".asInstanceOf[typings.dineroJs.dineroJsStrings.BHD]
    
    inline def BIF: typings.dineroJs.dineroJsStrings.BIF = "BIF".asInstanceOf[typings.dineroJs.dineroJsStrings.BIF]
    
    inline def BMD: typings.dineroJs.dineroJsStrings.BMD = "BMD".asInstanceOf[typings.dineroJs.dineroJsStrings.BMD]
    
    inline def BND: typings.dineroJs.dineroJsStrings.BND = "BND".asInstanceOf[typings.dineroJs.dineroJsStrings.BND]
    
    inline def BOB: typings.dineroJs.dineroJsStrings.BOB = "BOB".asInstanceOf[typings.dineroJs.dineroJsStrings.BOB]
    
    inline def BOV: typings.dineroJs.dineroJsStrings.BOV = "BOV".asInstanceOf[typings.dineroJs.dineroJsStrings.BOV]
    
    inline def BRL: typings.dineroJs.dineroJsStrings.BRL = "BRL".asInstanceOf[typings.dineroJs.dineroJsStrings.BRL]
    
    inline def BSD: typings.dineroJs.dineroJsStrings.BSD = "BSD".asInstanceOf[typings.dineroJs.dineroJsStrings.BSD]
    
    inline def BTN: typings.dineroJs.dineroJsStrings.BTN = "BTN".asInstanceOf[typings.dineroJs.dineroJsStrings.BTN]
    
    inline def BWP: typings.dineroJs.dineroJsStrings.BWP = "BWP".asInstanceOf[typings.dineroJs.dineroJsStrings.BWP]
    
    inline def BYN: typings.dineroJs.dineroJsStrings.BYN = "BYN".asInstanceOf[typings.dineroJs.dineroJsStrings.BYN]
    
    inline def BZD: typings.dineroJs.dineroJsStrings.BZD = "BZD".asInstanceOf[typings.dineroJs.dineroJsStrings.BZD]
    
    inline def CAD: typings.dineroJs.dineroJsStrings.CAD = "CAD".asInstanceOf[typings.dineroJs.dineroJsStrings.CAD]
    
    inline def CDF: typings.dineroJs.dineroJsStrings.CDF = "CDF".asInstanceOf[typings.dineroJs.dineroJsStrings.CDF]
    
    inline def CHE: typings.dineroJs.dineroJsStrings.CHE = "CHE".asInstanceOf[typings.dineroJs.dineroJsStrings.CHE]
    
    inline def CHF: typings.dineroJs.dineroJsStrings.CHF = "CHF".asInstanceOf[typings.dineroJs.dineroJsStrings.CHF]
    
    inline def CHW: typings.dineroJs.dineroJsStrings.CHW = "CHW".asInstanceOf[typings.dineroJs.dineroJsStrings.CHW]
    
    inline def CLF: typings.dineroJs.dineroJsStrings.CLF = "CLF".asInstanceOf[typings.dineroJs.dineroJsStrings.CLF]
    
    inline def CLP: typings.dineroJs.dineroJsStrings.CLP = "CLP".asInstanceOf[typings.dineroJs.dineroJsStrings.CLP]
    
    inline def CNY: typings.dineroJs.dineroJsStrings.CNY = "CNY".asInstanceOf[typings.dineroJs.dineroJsStrings.CNY]
    
    inline def COP: typings.dineroJs.dineroJsStrings.COP = "COP".asInstanceOf[typings.dineroJs.dineroJsStrings.COP]
    
    inline def COU: typings.dineroJs.dineroJsStrings.COU = "COU".asInstanceOf[typings.dineroJs.dineroJsStrings.COU]
    
    inline def CRC: typings.dineroJs.dineroJsStrings.CRC = "CRC".asInstanceOf[typings.dineroJs.dineroJsStrings.CRC]
    
    inline def CUC: typings.dineroJs.dineroJsStrings.CUC = "CUC".asInstanceOf[typings.dineroJs.dineroJsStrings.CUC]
    
    inline def CUP: typings.dineroJs.dineroJsStrings.CUP = "CUP".asInstanceOf[typings.dineroJs.dineroJsStrings.CUP]
    
    inline def CVE: typings.dineroJs.dineroJsStrings.CVE = "CVE".asInstanceOf[typings.dineroJs.dineroJsStrings.CVE]
    
    inline def CZK: typings.dineroJs.dineroJsStrings.CZK = "CZK".asInstanceOf[typings.dineroJs.dineroJsStrings.CZK]
    
    inline def DJF: typings.dineroJs.dineroJsStrings.DJF = "DJF".asInstanceOf[typings.dineroJs.dineroJsStrings.DJF]
    
    inline def DKK: typings.dineroJs.dineroJsStrings.DKK = "DKK".asInstanceOf[typings.dineroJs.dineroJsStrings.DKK]
    
    inline def DOP: typings.dineroJs.dineroJsStrings.DOP = "DOP".asInstanceOf[typings.dineroJs.dineroJsStrings.DOP]
    
    inline def DZD: typings.dineroJs.dineroJsStrings.DZD = "DZD".asInstanceOf[typings.dineroJs.dineroJsStrings.DZD]
    
    inline def EGP: typings.dineroJs.dineroJsStrings.EGP = "EGP".asInstanceOf[typings.dineroJs.dineroJsStrings.EGP]
    
    inline def ERN: typings.dineroJs.dineroJsStrings.ERN = "ERN".asInstanceOf[typings.dineroJs.dineroJsStrings.ERN]
    
    inline def ETB: typings.dineroJs.dineroJsStrings.ETB = "ETB".asInstanceOf[typings.dineroJs.dineroJsStrings.ETB]
    
    inline def EUR: typings.dineroJs.dineroJsStrings.EUR = "EUR".asInstanceOf[typings.dineroJs.dineroJsStrings.EUR]
    
    inline def FJD: typings.dineroJs.dineroJsStrings.FJD = "FJD".asInstanceOf[typings.dineroJs.dineroJsStrings.FJD]
    
    inline def FKP: typings.dineroJs.dineroJsStrings.FKP = "FKP".asInstanceOf[typings.dineroJs.dineroJsStrings.FKP]
    
    inline def GBP: typings.dineroJs.dineroJsStrings.GBP = "GBP".asInstanceOf[typings.dineroJs.dineroJsStrings.GBP]
    
    inline def GEL: typings.dineroJs.dineroJsStrings.GEL = "GEL".asInstanceOf[typings.dineroJs.dineroJsStrings.GEL]
    
    inline def GHS: typings.dineroJs.dineroJsStrings.GHS = "GHS".asInstanceOf[typings.dineroJs.dineroJsStrings.GHS]
    
    inline def GIP: typings.dineroJs.dineroJsStrings.GIP = "GIP".asInstanceOf[typings.dineroJs.dineroJsStrings.GIP]
    
    inline def GMD: typings.dineroJs.dineroJsStrings.GMD = "GMD".asInstanceOf[typings.dineroJs.dineroJsStrings.GMD]
    
    inline def GNF: typings.dineroJs.dineroJsStrings.GNF = "GNF".asInstanceOf[typings.dineroJs.dineroJsStrings.GNF]
    
    inline def GTQ: typings.dineroJs.dineroJsStrings.GTQ = "GTQ".asInstanceOf[typings.dineroJs.dineroJsStrings.GTQ]
    
    inline def GYD: typings.dineroJs.dineroJsStrings.GYD = "GYD".asInstanceOf[typings.dineroJs.dineroJsStrings.GYD]
    
    inline def HKD: typings.dineroJs.dineroJsStrings.HKD = "HKD".asInstanceOf[typings.dineroJs.dineroJsStrings.HKD]
    
    inline def HNL: typings.dineroJs.dineroJsStrings.HNL = "HNL".asInstanceOf[typings.dineroJs.dineroJsStrings.HNL]
    
    inline def HRK: typings.dineroJs.dineroJsStrings.HRK = "HRK".asInstanceOf[typings.dineroJs.dineroJsStrings.HRK]
    
    inline def HTG: typings.dineroJs.dineroJsStrings.HTG = "HTG".asInstanceOf[typings.dineroJs.dineroJsStrings.HTG]
    
    inline def HUF: typings.dineroJs.dineroJsStrings.HUF = "HUF".asInstanceOf[typings.dineroJs.dineroJsStrings.HUF]
    
    inline def IDR: typings.dineroJs.dineroJsStrings.IDR = "IDR".asInstanceOf[typings.dineroJs.dineroJsStrings.IDR]
    
    inline def ILS: typings.dineroJs.dineroJsStrings.ILS = "ILS".asInstanceOf[typings.dineroJs.dineroJsStrings.ILS]
    
    inline def INR: typings.dineroJs.dineroJsStrings.INR = "INR".asInstanceOf[typings.dineroJs.dineroJsStrings.INR]
    
    inline def IQD: typings.dineroJs.dineroJsStrings.IQD = "IQD".asInstanceOf[typings.dineroJs.dineroJsStrings.IQD]
    
    inline def IRR: typings.dineroJs.dineroJsStrings.IRR = "IRR".asInstanceOf[typings.dineroJs.dineroJsStrings.IRR]
    
    inline def ISK: typings.dineroJs.dineroJsStrings.ISK = "ISK".asInstanceOf[typings.dineroJs.dineroJsStrings.ISK]
    
    inline def JMD: typings.dineroJs.dineroJsStrings.JMD = "JMD".asInstanceOf[typings.dineroJs.dineroJsStrings.JMD]
    
    inline def JOD: typings.dineroJs.dineroJsStrings.JOD = "JOD".asInstanceOf[typings.dineroJs.dineroJsStrings.JOD]
    
    inline def JPY: typings.dineroJs.dineroJsStrings.JPY = "JPY".asInstanceOf[typings.dineroJs.dineroJsStrings.JPY]
    
    inline def KES: typings.dineroJs.dineroJsStrings.KES = "KES".asInstanceOf[typings.dineroJs.dineroJsStrings.KES]
    
    inline def KGS: typings.dineroJs.dineroJsStrings.KGS = "KGS".asInstanceOf[typings.dineroJs.dineroJsStrings.KGS]
    
    inline def KHR: typings.dineroJs.dineroJsStrings.KHR = "KHR".asInstanceOf[typings.dineroJs.dineroJsStrings.KHR]
    
    inline def KMF: typings.dineroJs.dineroJsStrings.KMF = "KMF".asInstanceOf[typings.dineroJs.dineroJsStrings.KMF]
    
    inline def KPW: typings.dineroJs.dineroJsStrings.KPW = "KPW".asInstanceOf[typings.dineroJs.dineroJsStrings.KPW]
    
    inline def KRW: typings.dineroJs.dineroJsStrings.KRW = "KRW".asInstanceOf[typings.dineroJs.dineroJsStrings.KRW]
    
    inline def KWD: typings.dineroJs.dineroJsStrings.KWD = "KWD".asInstanceOf[typings.dineroJs.dineroJsStrings.KWD]
    
    inline def KYD: typings.dineroJs.dineroJsStrings.KYD = "KYD".asInstanceOf[typings.dineroJs.dineroJsStrings.KYD]
    
    inline def KZT: typings.dineroJs.dineroJsStrings.KZT = "KZT".asInstanceOf[typings.dineroJs.dineroJsStrings.KZT]
    
    inline def LAK: typings.dineroJs.dineroJsStrings.LAK = "LAK".asInstanceOf[typings.dineroJs.dineroJsStrings.LAK]
    
    inline def LBP: typings.dineroJs.dineroJsStrings.LBP = "LBP".asInstanceOf[typings.dineroJs.dineroJsStrings.LBP]
    
    inline def LKR: typings.dineroJs.dineroJsStrings.LKR = "LKR".asInstanceOf[typings.dineroJs.dineroJsStrings.LKR]
    
    inline def LRD: typings.dineroJs.dineroJsStrings.LRD = "LRD".asInstanceOf[typings.dineroJs.dineroJsStrings.LRD]
    
    inline def LSL: typings.dineroJs.dineroJsStrings.LSL = "LSL".asInstanceOf[typings.dineroJs.dineroJsStrings.LSL]
    
    inline def LYD: typings.dineroJs.dineroJsStrings.LYD = "LYD".asInstanceOf[typings.dineroJs.dineroJsStrings.LYD]
    
    inline def MAD: typings.dineroJs.dineroJsStrings.MAD = "MAD".asInstanceOf[typings.dineroJs.dineroJsStrings.MAD]
    
    inline def MDL: typings.dineroJs.dineroJsStrings.MDL = "MDL".asInstanceOf[typings.dineroJs.dineroJsStrings.MDL]
    
    inline def MGA: typings.dineroJs.dineroJsStrings.MGA = "MGA".asInstanceOf[typings.dineroJs.dineroJsStrings.MGA]
    
    inline def MKD: typings.dineroJs.dineroJsStrings.MKD = "MKD".asInstanceOf[typings.dineroJs.dineroJsStrings.MKD]
    
    inline def MMK: typings.dineroJs.dineroJsStrings.MMK = "MMK".asInstanceOf[typings.dineroJs.dineroJsStrings.MMK]
    
    inline def MNT: typings.dineroJs.dineroJsStrings.MNT = "MNT".asInstanceOf[typings.dineroJs.dineroJsStrings.MNT]
    
    inline def MOP: typings.dineroJs.dineroJsStrings.MOP = "MOP".asInstanceOf[typings.dineroJs.dineroJsStrings.MOP]
    
    inline def MRU: typings.dineroJs.dineroJsStrings.MRU = "MRU".asInstanceOf[typings.dineroJs.dineroJsStrings.MRU]
    
    inline def MUR: typings.dineroJs.dineroJsStrings.MUR = "MUR".asInstanceOf[typings.dineroJs.dineroJsStrings.MUR]
    
    inline def MVR: typings.dineroJs.dineroJsStrings.MVR = "MVR".asInstanceOf[typings.dineroJs.dineroJsStrings.MVR]
    
    inline def MWK: typings.dineroJs.dineroJsStrings.MWK = "MWK".asInstanceOf[typings.dineroJs.dineroJsStrings.MWK]
    
    inline def MXN: typings.dineroJs.dineroJsStrings.MXN = "MXN".asInstanceOf[typings.dineroJs.dineroJsStrings.MXN]
    
    inline def MXV: typings.dineroJs.dineroJsStrings.MXV = "MXV".asInstanceOf[typings.dineroJs.dineroJsStrings.MXV]
    
    inline def MYR: typings.dineroJs.dineroJsStrings.MYR = "MYR".asInstanceOf[typings.dineroJs.dineroJsStrings.MYR]
    
    inline def MZN: typings.dineroJs.dineroJsStrings.MZN = "MZN".asInstanceOf[typings.dineroJs.dineroJsStrings.MZN]
    
    inline def NAD: typings.dineroJs.dineroJsStrings.NAD = "NAD".asInstanceOf[typings.dineroJs.dineroJsStrings.NAD]
    
    inline def NGN: typings.dineroJs.dineroJsStrings.NGN = "NGN".asInstanceOf[typings.dineroJs.dineroJsStrings.NGN]
    
    inline def NIO: typings.dineroJs.dineroJsStrings.NIO = "NIO".asInstanceOf[typings.dineroJs.dineroJsStrings.NIO]
    
    inline def NOK: typings.dineroJs.dineroJsStrings.NOK = "NOK".asInstanceOf[typings.dineroJs.dineroJsStrings.NOK]
    
    inline def NPR: typings.dineroJs.dineroJsStrings.NPR = "NPR".asInstanceOf[typings.dineroJs.dineroJsStrings.NPR]
    
    inline def NZD: typings.dineroJs.dineroJsStrings.NZD = "NZD".asInstanceOf[typings.dineroJs.dineroJsStrings.NZD]
    
    inline def OMR: typings.dineroJs.dineroJsStrings.OMR = "OMR".asInstanceOf[typings.dineroJs.dineroJsStrings.OMR]
    
    inline def PAB: typings.dineroJs.dineroJsStrings.PAB = "PAB".asInstanceOf[typings.dineroJs.dineroJsStrings.PAB]
    
    inline def PEN: typings.dineroJs.dineroJsStrings.PEN = "PEN".asInstanceOf[typings.dineroJs.dineroJsStrings.PEN]
    
    inline def PGK: typings.dineroJs.dineroJsStrings.PGK = "PGK".asInstanceOf[typings.dineroJs.dineroJsStrings.PGK]
    
    inline def PHP: typings.dineroJs.dineroJsStrings.PHP = "PHP".asInstanceOf[typings.dineroJs.dineroJsStrings.PHP]
    
    inline def PKR: typings.dineroJs.dineroJsStrings.PKR = "PKR".asInstanceOf[typings.dineroJs.dineroJsStrings.PKR]
    
    inline def PLN: typings.dineroJs.dineroJsStrings.PLN = "PLN".asInstanceOf[typings.dineroJs.dineroJsStrings.PLN]
    
    inline def PYG: typings.dineroJs.dineroJsStrings.PYG = "PYG".asInstanceOf[typings.dineroJs.dineroJsStrings.PYG]
    
    inline def QAR: typings.dineroJs.dineroJsStrings.QAR = "QAR".asInstanceOf[typings.dineroJs.dineroJsStrings.QAR]
    
    inline def RON: typings.dineroJs.dineroJsStrings.RON = "RON".asInstanceOf[typings.dineroJs.dineroJsStrings.RON]
    
    inline def RSD: typings.dineroJs.dineroJsStrings.RSD = "RSD".asInstanceOf[typings.dineroJs.dineroJsStrings.RSD]
    
    inline def RUB: typings.dineroJs.dineroJsStrings.RUB = "RUB".asInstanceOf[typings.dineroJs.dineroJsStrings.RUB]
    
    inline def RWF: typings.dineroJs.dineroJsStrings.RWF = "RWF".asInstanceOf[typings.dineroJs.dineroJsStrings.RWF]
    
    inline def SAR: typings.dineroJs.dineroJsStrings.SAR = "SAR".asInstanceOf[typings.dineroJs.dineroJsStrings.SAR]
    
    inline def SBD: typings.dineroJs.dineroJsStrings.SBD = "SBD".asInstanceOf[typings.dineroJs.dineroJsStrings.SBD]
    
    inline def SCR: typings.dineroJs.dineroJsStrings.SCR = "SCR".asInstanceOf[typings.dineroJs.dineroJsStrings.SCR]
    
    inline def SDG: typings.dineroJs.dineroJsStrings.SDG = "SDG".asInstanceOf[typings.dineroJs.dineroJsStrings.SDG]
    
    inline def SEK: typings.dineroJs.dineroJsStrings.SEK = "SEK".asInstanceOf[typings.dineroJs.dineroJsStrings.SEK]
    
    inline def SGD: typings.dineroJs.dineroJsStrings.SGD = "SGD".asInstanceOf[typings.dineroJs.dineroJsStrings.SGD]
    
    inline def SHP: typings.dineroJs.dineroJsStrings.SHP = "SHP".asInstanceOf[typings.dineroJs.dineroJsStrings.SHP]
    
    inline def SLL: typings.dineroJs.dineroJsStrings.SLL = "SLL".asInstanceOf[typings.dineroJs.dineroJsStrings.SLL]
    
    inline def SOS: typings.dineroJs.dineroJsStrings.SOS = "SOS".asInstanceOf[typings.dineroJs.dineroJsStrings.SOS]
    
    inline def SRD: typings.dineroJs.dineroJsStrings.SRD = "SRD".asInstanceOf[typings.dineroJs.dineroJsStrings.SRD]
    
    inline def SSP: typings.dineroJs.dineroJsStrings.SSP = "SSP".asInstanceOf[typings.dineroJs.dineroJsStrings.SSP]
    
    inline def STN: typings.dineroJs.dineroJsStrings.STN = "STN".asInstanceOf[typings.dineroJs.dineroJsStrings.STN]
    
    inline def SVC: typings.dineroJs.dineroJsStrings.SVC = "SVC".asInstanceOf[typings.dineroJs.dineroJsStrings.SVC]
    
    inline def SYP: typings.dineroJs.dineroJsStrings.SYP = "SYP".asInstanceOf[typings.dineroJs.dineroJsStrings.SYP]
    
    inline def SZL: typings.dineroJs.dineroJsStrings.SZL = "SZL".asInstanceOf[typings.dineroJs.dineroJsStrings.SZL]
    
    inline def THB: typings.dineroJs.dineroJsStrings.THB = "THB".asInstanceOf[typings.dineroJs.dineroJsStrings.THB]
    
    inline def TJS: typings.dineroJs.dineroJsStrings.TJS = "TJS".asInstanceOf[typings.dineroJs.dineroJsStrings.TJS]
    
    inline def TMT: typings.dineroJs.dineroJsStrings.TMT = "TMT".asInstanceOf[typings.dineroJs.dineroJsStrings.TMT]
    
    inline def TND: typings.dineroJs.dineroJsStrings.TND = "TND".asInstanceOf[typings.dineroJs.dineroJsStrings.TND]
    
    inline def TOP: typings.dineroJs.dineroJsStrings.TOP = "TOP".asInstanceOf[typings.dineroJs.dineroJsStrings.TOP]
    
    inline def TRY: typings.dineroJs.dineroJsStrings.TRY = "TRY".asInstanceOf[typings.dineroJs.dineroJsStrings.TRY]
    
    inline def TTD: typings.dineroJs.dineroJsStrings.TTD = "TTD".asInstanceOf[typings.dineroJs.dineroJsStrings.TTD]
    
    inline def TWD: typings.dineroJs.dineroJsStrings.TWD = "TWD".asInstanceOf[typings.dineroJs.dineroJsStrings.TWD]
    
    inline def TZS: typings.dineroJs.dineroJsStrings.TZS = "TZS".asInstanceOf[typings.dineroJs.dineroJsStrings.TZS]
    
    inline def UAH: typings.dineroJs.dineroJsStrings.UAH = "UAH".asInstanceOf[typings.dineroJs.dineroJsStrings.UAH]
    
    inline def UGX: typings.dineroJs.dineroJsStrings.UGX = "UGX".asInstanceOf[typings.dineroJs.dineroJsStrings.UGX]
    
    inline def USD: typings.dineroJs.dineroJsStrings.USD = "USD".asInstanceOf[typings.dineroJs.dineroJsStrings.USD]
    
    inline def USN: typings.dineroJs.dineroJsStrings.USN = "USN".asInstanceOf[typings.dineroJs.dineroJsStrings.USN]
    
    inline def UYI: typings.dineroJs.dineroJsStrings.UYI = "UYI".asInstanceOf[typings.dineroJs.dineroJsStrings.UYI]
    
    inline def UYU: typings.dineroJs.dineroJsStrings.UYU = "UYU".asInstanceOf[typings.dineroJs.dineroJsStrings.UYU]
    
    inline def UYW: typings.dineroJs.dineroJsStrings.UYW = "UYW".asInstanceOf[typings.dineroJs.dineroJsStrings.UYW]
    
    inline def UZS: typings.dineroJs.dineroJsStrings.UZS = "UZS".asInstanceOf[typings.dineroJs.dineroJsStrings.UZS]
    
    inline def VES: typings.dineroJs.dineroJsStrings.VES = "VES".asInstanceOf[typings.dineroJs.dineroJsStrings.VES]
    
    inline def VND: typings.dineroJs.dineroJsStrings.VND = "VND".asInstanceOf[typings.dineroJs.dineroJsStrings.VND]
    
    inline def VUV: typings.dineroJs.dineroJsStrings.VUV = "VUV".asInstanceOf[typings.dineroJs.dineroJsStrings.VUV]
    
    inline def WST: typings.dineroJs.dineroJsStrings.WST = "WST".asInstanceOf[typings.dineroJs.dineroJsStrings.WST]
    
    inline def XAF: typings.dineroJs.dineroJsStrings.XAF = "XAF".asInstanceOf[typings.dineroJs.dineroJsStrings.XAF]
    
    inline def XAG: typings.dineroJs.dineroJsStrings.XAG = "XAG".asInstanceOf[typings.dineroJs.dineroJsStrings.XAG]
    
    inline def XAU: typings.dineroJs.dineroJsStrings.XAU = "XAU".asInstanceOf[typings.dineroJs.dineroJsStrings.XAU]
    
    inline def XBA: typings.dineroJs.dineroJsStrings.XBA = "XBA".asInstanceOf[typings.dineroJs.dineroJsStrings.XBA]
    
    inline def XBB: typings.dineroJs.dineroJsStrings.XBB = "XBB".asInstanceOf[typings.dineroJs.dineroJsStrings.XBB]
    
    inline def XBC: typings.dineroJs.dineroJsStrings.XBC = "XBC".asInstanceOf[typings.dineroJs.dineroJsStrings.XBC]
    
    inline def XBD: typings.dineroJs.dineroJsStrings.XBD = "XBD".asInstanceOf[typings.dineroJs.dineroJsStrings.XBD]
    
    inline def XCD: typings.dineroJs.dineroJsStrings.XCD = "XCD".asInstanceOf[typings.dineroJs.dineroJsStrings.XCD]
    
    inline def XDR: typings.dineroJs.dineroJsStrings.XDR = "XDR".asInstanceOf[typings.dineroJs.dineroJsStrings.XDR]
    
    inline def XOF: typings.dineroJs.dineroJsStrings.XOF = "XOF".asInstanceOf[typings.dineroJs.dineroJsStrings.XOF]
    
    inline def XPD: typings.dineroJs.dineroJsStrings.XPD = "XPD".asInstanceOf[typings.dineroJs.dineroJsStrings.XPD]
    
    inline def XPF: typings.dineroJs.dineroJsStrings.XPF = "XPF".asInstanceOf[typings.dineroJs.dineroJsStrings.XPF]
    
    inline def XPT: typings.dineroJs.dineroJsStrings.XPT = "XPT".asInstanceOf[typings.dineroJs.dineroJsStrings.XPT]
    
    inline def XSU: typings.dineroJs.dineroJsStrings.XSU = "XSU".asInstanceOf[typings.dineroJs.dineroJsStrings.XSU]
    
    inline def XTS: typings.dineroJs.dineroJsStrings.XTS = "XTS".asInstanceOf[typings.dineroJs.dineroJsStrings.XTS]
    
    inline def XUA: typings.dineroJs.dineroJsStrings.XUA = "XUA".asInstanceOf[typings.dineroJs.dineroJsStrings.XUA]
    
    inline def XXX: typings.dineroJs.dineroJsStrings.XXX = "XXX".asInstanceOf[typings.dineroJs.dineroJsStrings.XXX]
    
    inline def YER: typings.dineroJs.dineroJsStrings.YER = "YER".asInstanceOf[typings.dineroJs.dineroJsStrings.YER]
    
    inline def ZAR: typings.dineroJs.dineroJsStrings.ZAR = "ZAR".asInstanceOf[typings.dineroJs.dineroJsStrings.ZAR]
    
    inline def ZMW: typings.dineroJs.dineroJsStrings.ZMW = "ZMW".asInstanceOf[typings.dineroJs.dineroJsStrings.ZMW]
    
    inline def ZWL: typings.dineroJs.dineroJsStrings.ZWL = "ZWL".asInstanceOf[typings.dineroJs.dineroJsStrings.ZWL]
  }
  
  @js.native
  trait Dinero extends StObject {
    
    def add(addend: Dinero): Dinero = js.native
    
    def allocate(ratios: js.Array[Double]): js.Array[Dinero] = js.native
    
    def convert(currency: String): js.Promise[Dinero] = js.native
    def convert(currency: String, options: ExchangeRatesApiOptions): js.Promise[Dinero] = js.native
    
    def convertPrecision(newPrecision: Double): Dinero = js.native
    def convertPrecision(newPrecision: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def divide(divisor: Double): Dinero = js.native
    def divide(divisor: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def equalsTo(comparator: Dinero): Boolean = js.native
    
    def getAmount(): Double = js.native
    
    def getCurrency(): Currency = js.native
    
    def getLocale(): String = js.native
    
    def getPrecision(): Double = js.native
    
    def greaterThan(comparator: Dinero): Boolean = js.native
    
    def greaterThanOrEqual(comparator: Dinero): Boolean = js.native
    
    /**
      * @deprecated since version 2.0
      */
    def hasCents(): Boolean = js.native
    
    def hasSameAmount(comparator: Dinero): Boolean = js.native
    
    def hasSameCurrency(comparator: Dinero): Boolean = js.native
    
    def hasSubUnits(): Boolean = js.native
    
    def isNegative(): Boolean = js.native
    
    def isPositive(): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def lessThan(comparator: Dinero): Boolean = js.native
    
    def lessThanOrEqual(comparator: Dinero): Boolean = js.native
    
    def multiply(multiplier: Double): Dinero = js.native
    def multiply(multiplier: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def percentage(percentage: Double): Dinero = js.native
    def percentage(percentage: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def setLocale(newLocale: String): Dinero = js.native
    
    def subtract(subtrahend: Dinero): Dinero = js.native
    
    def toFormat(): String = js.native
    def toFormat(format: String): String = js.native
    def toFormat(format: String, roundingMode: RoundingMode): String = js.native
    def toFormat(format: Unit, roundingMode: RoundingMode): String = js.native
    
    def toJSON(): DineroObject = js.native
    
    def toObject(): DineroObject = js.native
    
    def toRoundedUnit(digits: Double): Double = js.native
    def toRoundedUnit(digits: Double, roundingMode: RoundingMode): Double = js.native
    
    def toUnit(): Double = js.native
  }
  
  trait DineroObject extends StObject {
    
    var amount: Double
    
    var currency: Currency
    
    var precision: Double
  }
  object DineroObject {
    
    inline def apply(amount: Double, currency: Currency, precision: Double): DineroObject = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[DineroObject]
    }
    
    extension [Self <: DineroObject](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExchangeRatesApiOptions extends StObject {
    
    var endpoint: String | js.Promise[StringDictionary[Any]]
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var propertyPath: js.UndefOr[String] = js.undefined
    
    var roundingMode: js.UndefOr[RoundingMode] = js.undefined
  }
  object ExchangeRatesApiOptions {
    
    inline def apply(endpoint: String | js.Promise[StringDictionary[Any]]): ExchangeRatesApiOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExchangeRatesApiOptions]
    }
    
    extension [Self <: ExchangeRatesApiOptions](x: Self) {
      
      inline def setEndpoint(value: String | js.Promise[StringDictionary[Any]]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      inline def setPropertyPathUndefined: Self = StObject.set(x, "propertyPath", js.undefined)
      
      inline def setRoundingMode(value: RoundingMode): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
      
      inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var currency: js.UndefOr[Currency] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dineroJs.dineroJsStrings.HALF_ODD
    - typings.dineroJs.dineroJsStrings.HALF_EVEN
    - typings.dineroJs.dineroJsStrings.HALF_UP
    - typings.dineroJs.dineroJsStrings.HALF_DOWN
    - typings.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO
    - typings.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO
    - typings.dineroJs.dineroJsStrings.DOWN
  */
  trait RoundingMode extends StObject
  object RoundingMode {
    
    inline def DOWN: typings.dineroJs.dineroJsStrings.DOWN = "DOWN".asInstanceOf[typings.dineroJs.dineroJsStrings.DOWN]
    
    inline def HALF_AWAY_FROM_ZERO: typings.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO = "HALF_AWAY_FROM_ZERO".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO]
    
    inline def HALF_DOWN: typings.dineroJs.dineroJsStrings.HALF_DOWN = "HALF_DOWN".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_DOWN]
    
    inline def HALF_EVEN: typings.dineroJs.dineroJsStrings.HALF_EVEN = "HALF_EVEN".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_EVEN]
    
    inline def HALF_ODD: typings.dineroJs.dineroJsStrings.HALF_ODD = "HALF_ODD".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_ODD]
    
    inline def HALF_TOWARDS_ZERO: typings.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO = "HALF_TOWARDS_ZERO".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO]
    
    inline def HALF_UP: typings.dineroJs.dineroJsStrings.HALF_UP = "HALF_UP".asInstanceOf[typings.dineroJs.dineroJsStrings.HALF_UP]
  }
}
