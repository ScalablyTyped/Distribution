organization := "org.scalablytyped"
name := "dmg-license"
version := "1.0.11-a76d28"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "iconv-corefoundation" % "1.1.7-e5c29d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20220624Z-995f6c",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20220720Z-99e65b",
  "org.scalablytyped" %%% "xmlbuilder" % "15.1.1-6da421")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
