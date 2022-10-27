organization := "org.scalablytyped"
name := "dmg-license"
version := "1.0.11-5ffb1f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "iconv-corefoundation" % "1.1.7-fe2183",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20220624Z-c0738d",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20220720Z-99e65b",
  "org.scalablytyped" %%% "xmlbuilder" % "15.1.1-7d2b84")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
