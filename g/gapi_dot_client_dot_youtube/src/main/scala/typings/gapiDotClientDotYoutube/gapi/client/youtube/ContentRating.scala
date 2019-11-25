package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRating extends js.Object {
  /**
    * The video's Australian Classification Board (ACB) or Australian Communications and Media Authority (ACMA) rating. ACMA ratings are used to classify
    * children's television programming.
    */
  var acbRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Italy's Autorità per le Garanzie nelle Comunicazioni (AGCOM). */
  var agcomRating: js.UndefOr[String] = js.undefined
  /** The video's Anatel (Asociación Nacional de Televisión) rating for Chilean television. */
  var anatelRating: js.UndefOr[String] = js.undefined
  /** The video's British Board of Film Classification (BBFC) rating. */
  var bbfcRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Thailand's Board of Film and Video Censors. */
  var bfvcRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Austrian Board of Media Classification (Bundesministerium für Unterricht, Kunst und Kultur). */
  var bmukkRating: js.UndefOr[String] = js.undefined
  /**
    * Rating system for Canadian TV - Canadian TV Classification System The video's rating from the Canadian Radio-Television and Telecommunications
    * Commission (CRTC) for Canadian English-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.
    */
  var catvRating: js.UndefOr[String] = js.undefined
  /**
    * The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian French-language broadcasts. For more
    * information, see the Canadian Broadcast Standards Council website.
    */
  var catvfrRating: js.UndefOr[String] = js.undefined
  /** The video's Central Board of Film Certification (CBFC - India) rating. */
  var cbfcRating: js.UndefOr[String] = js.undefined
  /** The video's Consejo de Calificación Cinematográfica (Chile) rating. */
  var cccRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Portugal's Comissão de Classificação de Espect´culos. */
  var cceRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Switzerland. */
  var chfilmRating: js.UndefOr[String] = js.undefined
  /** The video's Canadian Home Video Rating System (CHVRS) rating. */
  var chvrsRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Commission de Contrôle des Films (Belgium). */
  var cicfRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Romania's CONSILIUL NATIONAL AL AUDIOVIZUALULUI (CNA). */
  var cnaRating: js.UndefOr[String] = js.undefined
  /** Rating system in France - Commission de classification cinematographique */
  var cncRating: js.UndefOr[String] = js.undefined
  /** The video's rating from France's Conseil supérieur de l?audiovisuel, which rates broadcast content. */
  var csaRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Luxembourg's Commission de surveillance de la classification des films (CSCF). */
  var cscfRating: js.UndefOr[String] = js.undefined
  /** The video's rating in the Czech Republic. */
  var czfilmRating: js.UndefOr[String] = js.undefined
  /** The video's Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating. */
  var djctqRating: js.UndefOr[String] = js.undefined
  /** Reasons that explain why the video received its DJCQT (Brazil) rating. */
  var djctqRatingReasons: js.UndefOr[js.Array[String]] = js.undefined
  /** Rating system in Turkey - Evaluation and Classification Board of the Ministry of Culture and Tourism */
  var ecbmctRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Estonia. */
  var eefilmRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Egypt. */
  var egfilmRating: js.UndefOr[String] = js.undefined
  /** The video's Eirin (映倫) rating. Eirin is the Japanese rating system. */
  var eirinRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Malaysia's Film Censorship Board. */
  var fcbmRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Hong Kong's Office for Film, Newspaper and Article Administration. */
  var fcoRating: js.UndefOr[String] = js.undefined
  /** This property has been deprecated. Use the contentDetails.contentRating.cncRating instead. */
  var fmocRating: js.UndefOr[String] = js.undefined
  /** The video's rating from South Africa's Film and Publication Board. */
  var fpbRating: js.UndefOr[String] = js.undefined
  /** Reasons that explain why the video received its FPB (South Africa) rating. */
  var fpbRatingReasons: js.UndefOr[js.Array[String]] = js.undefined
  /** The video's Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating. */
  var fskRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Greece. */
  var grfilmRating: js.UndefOr[String] = js.undefined
  /** The video's Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating. */
  var icaaRating: js.UndefOr[String] = js.undefined
  /** The video's Irish Film Classification Office (IFCO - Ireland) rating. See the IFCO website for more information. */
  var ifcoRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Israel. */
  var ilfilmRating: js.UndefOr[String] = js.undefined
  /** The video's INCAA (Instituto Nacional de Cine y Artes Audiovisuales - Argentina) rating. */
  var incaaRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Kenya Film Classification Board. */
  var kfcbRating: js.UndefOr[String] = js.undefined
  /** voor de Classificatie van Audiovisuele Media (Netherlands). */
  var kijkwijzerRating: js.UndefOr[String] = js.undefined
  /** The video's Korea Media Rating Board (영상물등급위원회) rating. The KMRB rates videos in South Korea. */
  var kmrbRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Indonesia's Lembaga Sensor Film. */
  var lsfRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Malta's Film Age-Classification Board. */
  var mccaaRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Danish Film Institute's (Det Danske Filminstitut) Media Council for Children and Young People. */
  var mccypRating: js.UndefOr[String] = js.undefined
  /** The video's rating system for Vietnam - MCST */
  var mcstRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Singapore's Media Development Authority (MDA) and, specifically, it's Board of Film Censors (BFC). */
  var mdaRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Medietilsynet, the Norwegian Media Authority. */
  var medietilsynetRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Finland's Kansallinen Audiovisuaalinen Instituutti (National Audiovisual Institute). */
  var mekuRating: js.UndefOr[String] = js.undefined
  /** The rating system for MENA countries, a clone of MPAA. It is needed to */
  var menaMpaaRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Ministero dei Beni e delle Attività Culturali e del Turismo (Italy). */
  var mibacRating: js.UndefOr[String] = js.undefined
  /** The video's Ministerio de Cultura (Colombia) rating. */
  var mocRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Taiwan's Ministry of Culture (文化部). */
  var moctwRating: js.UndefOr[String] = js.undefined
  /** The video's Motion Picture Association of America (MPAA) rating. */
  var mpaaRating: js.UndefOr[String] = js.undefined
  /** The rating system for trailer, DVD, and Ad in the US. See http://movielabs.com/md/ratings/v2.3/html/US_MPAAT_Ratings.html. */
  var mpaatRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Movie and Television Review and Classification Board (Philippines). */
  var mtrcbRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Maldives National Bureau of Classification. */
  var nbcRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Poland. */
  var nbcplRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Bulgarian National Film Center. */
  var nfrcRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Nigeria's National Film and Video Censors Board. */
  var nfvcbRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Nacionãlais Kino centrs (National Film Centre of Latvia). */
  var nkclvRating: js.UndefOr[String] = js.undefined
  /** The video's Office of Film and Literature Classification (OFLC - New Zealand) rating. */
  var oflcRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Peru. */
  var pefilmRating: js.UndefOr[String] = js.undefined
  /** The video's rating from the Hungarian Nemzeti Filmiroda, the Rating Committee of the National Office of Film. */
  var rcnofRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Venezuela. */
  var resorteviolenciaRating: js.UndefOr[String] = js.undefined
  /** The video's General Directorate of Radio, Television and Cinematography (Mexico) rating. */
  var rtcRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Ireland's Raidió Teilifís Éireann. */
  var rteRating: js.UndefOr[String] = js.undefined
  /** The video's National Film Registry of the Russian Federation (MKRF - Russia) rating. */
  var russiaRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Slovakia. */
  var skfilmRating: js.UndefOr[String] = js.undefined
  /** The video's rating in Iceland. */
  var smaisRating: js.UndefOr[String] = js.undefined
  /** The video's rating from Statens medieråd (Sweden's National Media Council). */
  var smsaRating: js.UndefOr[String] = js.undefined
  /** The video's TV Parental Guidelines (TVPG) rating. */
  var tvpgRating: js.UndefOr[String] = js.undefined
  /** A rating that YouTube uses to identify age-restricted content. */
  var ytRating: js.UndefOr[String] = js.undefined
}

object ContentRating {
  @scala.inline
  def apply(
    acbRating: String = null,
    agcomRating: String = null,
    anatelRating: String = null,
    bbfcRating: String = null,
    bfvcRating: String = null,
    bmukkRating: String = null,
    catvRating: String = null,
    catvfrRating: String = null,
    cbfcRating: String = null,
    cccRating: String = null,
    cceRating: String = null,
    chfilmRating: String = null,
    chvrsRating: String = null,
    cicfRating: String = null,
    cnaRating: String = null,
    cncRating: String = null,
    csaRating: String = null,
    cscfRating: String = null,
    czfilmRating: String = null,
    djctqRating: String = null,
    djctqRatingReasons: js.Array[String] = null,
    ecbmctRating: String = null,
    eefilmRating: String = null,
    egfilmRating: String = null,
    eirinRating: String = null,
    fcbmRating: String = null,
    fcoRating: String = null,
    fmocRating: String = null,
    fpbRating: String = null,
    fpbRatingReasons: js.Array[String] = null,
    fskRating: String = null,
    grfilmRating: String = null,
    icaaRating: String = null,
    ifcoRating: String = null,
    ilfilmRating: String = null,
    incaaRating: String = null,
    kfcbRating: String = null,
    kijkwijzerRating: String = null,
    kmrbRating: String = null,
    lsfRating: String = null,
    mccaaRating: String = null,
    mccypRating: String = null,
    mcstRating: String = null,
    mdaRating: String = null,
    medietilsynetRating: String = null,
    mekuRating: String = null,
    menaMpaaRating: String = null,
    mibacRating: String = null,
    mocRating: String = null,
    moctwRating: String = null,
    mpaaRating: String = null,
    mpaatRating: String = null,
    mtrcbRating: String = null,
    nbcRating: String = null,
    nbcplRating: String = null,
    nfrcRating: String = null,
    nfvcbRating: String = null,
    nkclvRating: String = null,
    oflcRating: String = null,
    pefilmRating: String = null,
    rcnofRating: String = null,
    resorteviolenciaRating: String = null,
    rtcRating: String = null,
    rteRating: String = null,
    russiaRating: String = null,
    skfilmRating: String = null,
    smaisRating: String = null,
    smsaRating: String = null,
    tvpgRating: String = null,
    ytRating: String = null
  ): ContentRating = {
    val __obj = js.Dynamic.literal()
    if (acbRating != null) __obj.updateDynamic("acbRating")(acbRating.asInstanceOf[js.Any])
    if (agcomRating != null) __obj.updateDynamic("agcomRating")(agcomRating.asInstanceOf[js.Any])
    if (anatelRating != null) __obj.updateDynamic("anatelRating")(anatelRating.asInstanceOf[js.Any])
    if (bbfcRating != null) __obj.updateDynamic("bbfcRating")(bbfcRating.asInstanceOf[js.Any])
    if (bfvcRating != null) __obj.updateDynamic("bfvcRating")(bfvcRating.asInstanceOf[js.Any])
    if (bmukkRating != null) __obj.updateDynamic("bmukkRating")(bmukkRating.asInstanceOf[js.Any])
    if (catvRating != null) __obj.updateDynamic("catvRating")(catvRating.asInstanceOf[js.Any])
    if (catvfrRating != null) __obj.updateDynamic("catvfrRating")(catvfrRating.asInstanceOf[js.Any])
    if (cbfcRating != null) __obj.updateDynamic("cbfcRating")(cbfcRating.asInstanceOf[js.Any])
    if (cccRating != null) __obj.updateDynamic("cccRating")(cccRating.asInstanceOf[js.Any])
    if (cceRating != null) __obj.updateDynamic("cceRating")(cceRating.asInstanceOf[js.Any])
    if (chfilmRating != null) __obj.updateDynamic("chfilmRating")(chfilmRating.asInstanceOf[js.Any])
    if (chvrsRating != null) __obj.updateDynamic("chvrsRating")(chvrsRating.asInstanceOf[js.Any])
    if (cicfRating != null) __obj.updateDynamic("cicfRating")(cicfRating.asInstanceOf[js.Any])
    if (cnaRating != null) __obj.updateDynamic("cnaRating")(cnaRating.asInstanceOf[js.Any])
    if (cncRating != null) __obj.updateDynamic("cncRating")(cncRating.asInstanceOf[js.Any])
    if (csaRating != null) __obj.updateDynamic("csaRating")(csaRating.asInstanceOf[js.Any])
    if (cscfRating != null) __obj.updateDynamic("cscfRating")(cscfRating.asInstanceOf[js.Any])
    if (czfilmRating != null) __obj.updateDynamic("czfilmRating")(czfilmRating.asInstanceOf[js.Any])
    if (djctqRating != null) __obj.updateDynamic("djctqRating")(djctqRating.asInstanceOf[js.Any])
    if (djctqRatingReasons != null) __obj.updateDynamic("djctqRatingReasons")(djctqRatingReasons.asInstanceOf[js.Any])
    if (ecbmctRating != null) __obj.updateDynamic("ecbmctRating")(ecbmctRating.asInstanceOf[js.Any])
    if (eefilmRating != null) __obj.updateDynamic("eefilmRating")(eefilmRating.asInstanceOf[js.Any])
    if (egfilmRating != null) __obj.updateDynamic("egfilmRating")(egfilmRating.asInstanceOf[js.Any])
    if (eirinRating != null) __obj.updateDynamic("eirinRating")(eirinRating.asInstanceOf[js.Any])
    if (fcbmRating != null) __obj.updateDynamic("fcbmRating")(fcbmRating.asInstanceOf[js.Any])
    if (fcoRating != null) __obj.updateDynamic("fcoRating")(fcoRating.asInstanceOf[js.Any])
    if (fmocRating != null) __obj.updateDynamic("fmocRating")(fmocRating.asInstanceOf[js.Any])
    if (fpbRating != null) __obj.updateDynamic("fpbRating")(fpbRating.asInstanceOf[js.Any])
    if (fpbRatingReasons != null) __obj.updateDynamic("fpbRatingReasons")(fpbRatingReasons.asInstanceOf[js.Any])
    if (fskRating != null) __obj.updateDynamic("fskRating")(fskRating.asInstanceOf[js.Any])
    if (grfilmRating != null) __obj.updateDynamic("grfilmRating")(grfilmRating.asInstanceOf[js.Any])
    if (icaaRating != null) __obj.updateDynamic("icaaRating")(icaaRating.asInstanceOf[js.Any])
    if (ifcoRating != null) __obj.updateDynamic("ifcoRating")(ifcoRating.asInstanceOf[js.Any])
    if (ilfilmRating != null) __obj.updateDynamic("ilfilmRating")(ilfilmRating.asInstanceOf[js.Any])
    if (incaaRating != null) __obj.updateDynamic("incaaRating")(incaaRating.asInstanceOf[js.Any])
    if (kfcbRating != null) __obj.updateDynamic("kfcbRating")(kfcbRating.asInstanceOf[js.Any])
    if (kijkwijzerRating != null) __obj.updateDynamic("kijkwijzerRating")(kijkwijzerRating.asInstanceOf[js.Any])
    if (kmrbRating != null) __obj.updateDynamic("kmrbRating")(kmrbRating.asInstanceOf[js.Any])
    if (lsfRating != null) __obj.updateDynamic("lsfRating")(lsfRating.asInstanceOf[js.Any])
    if (mccaaRating != null) __obj.updateDynamic("mccaaRating")(mccaaRating.asInstanceOf[js.Any])
    if (mccypRating != null) __obj.updateDynamic("mccypRating")(mccypRating.asInstanceOf[js.Any])
    if (mcstRating != null) __obj.updateDynamic("mcstRating")(mcstRating.asInstanceOf[js.Any])
    if (mdaRating != null) __obj.updateDynamic("mdaRating")(mdaRating.asInstanceOf[js.Any])
    if (medietilsynetRating != null) __obj.updateDynamic("medietilsynetRating")(medietilsynetRating.asInstanceOf[js.Any])
    if (mekuRating != null) __obj.updateDynamic("mekuRating")(mekuRating.asInstanceOf[js.Any])
    if (menaMpaaRating != null) __obj.updateDynamic("menaMpaaRating")(menaMpaaRating.asInstanceOf[js.Any])
    if (mibacRating != null) __obj.updateDynamic("mibacRating")(mibacRating.asInstanceOf[js.Any])
    if (mocRating != null) __obj.updateDynamic("mocRating")(mocRating.asInstanceOf[js.Any])
    if (moctwRating != null) __obj.updateDynamic("moctwRating")(moctwRating.asInstanceOf[js.Any])
    if (mpaaRating != null) __obj.updateDynamic("mpaaRating")(mpaaRating.asInstanceOf[js.Any])
    if (mpaatRating != null) __obj.updateDynamic("mpaatRating")(mpaatRating.asInstanceOf[js.Any])
    if (mtrcbRating != null) __obj.updateDynamic("mtrcbRating")(mtrcbRating.asInstanceOf[js.Any])
    if (nbcRating != null) __obj.updateDynamic("nbcRating")(nbcRating.asInstanceOf[js.Any])
    if (nbcplRating != null) __obj.updateDynamic("nbcplRating")(nbcplRating.asInstanceOf[js.Any])
    if (nfrcRating != null) __obj.updateDynamic("nfrcRating")(nfrcRating.asInstanceOf[js.Any])
    if (nfvcbRating != null) __obj.updateDynamic("nfvcbRating")(nfvcbRating.asInstanceOf[js.Any])
    if (nkclvRating != null) __obj.updateDynamic("nkclvRating")(nkclvRating.asInstanceOf[js.Any])
    if (oflcRating != null) __obj.updateDynamic("oflcRating")(oflcRating.asInstanceOf[js.Any])
    if (pefilmRating != null) __obj.updateDynamic("pefilmRating")(pefilmRating.asInstanceOf[js.Any])
    if (rcnofRating != null) __obj.updateDynamic("rcnofRating")(rcnofRating.asInstanceOf[js.Any])
    if (resorteviolenciaRating != null) __obj.updateDynamic("resorteviolenciaRating")(resorteviolenciaRating.asInstanceOf[js.Any])
    if (rtcRating != null) __obj.updateDynamic("rtcRating")(rtcRating.asInstanceOf[js.Any])
    if (rteRating != null) __obj.updateDynamic("rteRating")(rteRating.asInstanceOf[js.Any])
    if (russiaRating != null) __obj.updateDynamic("russiaRating")(russiaRating.asInstanceOf[js.Any])
    if (skfilmRating != null) __obj.updateDynamic("skfilmRating")(skfilmRating.asInstanceOf[js.Any])
    if (smaisRating != null) __obj.updateDynamic("smaisRating")(smaisRating.asInstanceOf[js.Any])
    if (smsaRating != null) __obj.updateDynamic("smsaRating")(smsaRating.asInstanceOf[js.Any])
    if (tvpgRating != null) __obj.updateDynamic("tvpgRating")(tvpgRating.asInstanceOf[js.Any])
    if (ytRating != null) __obj.updateDynamic("ytRating")(ytRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRating]
  }
}

